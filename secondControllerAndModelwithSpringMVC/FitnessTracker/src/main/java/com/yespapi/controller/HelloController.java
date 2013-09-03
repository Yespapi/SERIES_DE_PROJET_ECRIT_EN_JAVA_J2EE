package com.yespapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//un controlleur qui dit hello

@Controller
/**
 * 
 * @author eyebe
 *
 */
public class HelloController {
	
	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World");
		return "Hello";
		
	}
}
