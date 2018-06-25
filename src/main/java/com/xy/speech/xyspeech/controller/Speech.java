package com.xy.speech.xyspeech.controller;

import com.xy.speech.xyspeech.model.SpeechModel;
import com.xy.speech.xyspeech.service.SpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/speech")
public class Speech {
@Autowired
private SpeechService speechService;
    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    @RequestMapping("/speech")
    public String speech(@RequestBody SpeechModel speech){
        return speechService.returnRet(speech.getPath());
    }
}
