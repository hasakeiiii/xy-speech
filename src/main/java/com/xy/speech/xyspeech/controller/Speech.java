package com.xy.speech.xyspeech.controller;

import com.xy.speech.xyspeech.model.SpeechModel;
import com.xy.speech.xyspeech.service.SpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public Object speech(@RequestParam(value = "path",defaultValue = "D:\\private\\test\\baidu\\16k.pcm") String path){
        ModelAndView mv = new ModelAndView();
        mv.addAllObjects(speechService.returnRet(path));
        mv.setViewName("chuanwen");
        return mv ;
    }
}
