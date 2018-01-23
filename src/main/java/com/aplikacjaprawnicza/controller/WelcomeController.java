package com.aplikacjaprawnicza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    
    @RequestMapping("/welcome")
	public String welcome() {
		//model.put("message", this.message);
		return "test";
	}
    
}
