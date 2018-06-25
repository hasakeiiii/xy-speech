package com.xy.speech.xyspeech.controller;

import com.xy.speech.xyspeech.model.SpeechModel;
import com.xy.speech.xyspeech.service.SpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/speech")
public class Speech {
@Autowired
private SpeechService speechService;
    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    @GetMapping("/speech")
    public String speech(@RequestParam(value = "path") String path){
        return speechService.returnRet(path);
    }
}
