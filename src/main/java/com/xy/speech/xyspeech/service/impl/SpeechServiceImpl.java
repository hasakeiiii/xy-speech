package com.xy.speech.xyspeech.service.impl;

import com.xy.speech.xyspeech.service.SpeechService;
import com.xy.speech.xyspeech.utils.SpeechUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("speechService")
public class SpeechServiceImpl implements SpeechService {
    @Override
    public Map<String, Object> returnRet(String path) {
        Map<String, Object> map = new HashMap<String, Object>();
        String ret = "error";
        String[] pathArr = path.split("\\.");
        JSONObject json = SpeechUtil.speechUtil(path, pathArr[1]);
        try {
            ret = json.getJSONArray("result").get(0).toString();
            map.put("ret",ret);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return map;
    }
}
