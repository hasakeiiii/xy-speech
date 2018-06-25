package com.xy.speech.xyspeech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@Configuration
public class XySpeechApplication {

	public static void main(String[] args) {
		SpringApplication.run(XySpeechApplication.class, args);
	}

//	@RequestMapping(value = "speech")
//	@ResponseBody
//	public String speech() {
//
//		return "chuanwen";
//
//	}
}
