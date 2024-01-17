package com.teluguskillhub.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMVC {
	
	@GetMapping(value="/")
	public String getHome() {
		return "home.jsp";
	}

}
