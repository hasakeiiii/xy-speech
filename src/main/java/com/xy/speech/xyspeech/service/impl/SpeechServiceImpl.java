package com.xy.speech.xyspeech.service.impl;

import com.xy.speech.xyspeech.service.SpeechService;
import com.xy.speech.xyspeech.utils.SpeechUtil;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service("speechService")
public class SpeechServiceImpl implements SpeechService {
    @Override
    public String returnRet(String path) {
        String ret = "";
        String[] pathArr = path.split(".");
        JSONObject json = SpeechUtil.speechUtil(path,pathArr[1]);
        try {
			ret = json.getString("result");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ret;
    }
}
