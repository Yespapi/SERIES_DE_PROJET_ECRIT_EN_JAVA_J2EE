package com.yespapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yespapi.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value= "/addMinutes")
	public  String AddMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("exercises :"+exercise.getMinutes());
		return "addMinutes";
	}

}
