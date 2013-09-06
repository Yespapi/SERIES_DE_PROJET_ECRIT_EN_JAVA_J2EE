package com.yespapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

import com.yespapi.model.Activity;
import com.yespapi.model.Exercise;

@Controller
public class MinutesController {
	  
	@RequestMapping(value= "/addMinutes")
	public  String AddMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("exercises :"+exercise.getMinutes());
		System.out.println("exercises activiy:"+exercise.getActivity());
		//return "forword:addMoreMinutes.html";
		return "redirect:addMoreMinutes.html";
		
	}
	
	@RequestMappign(value ="/activities", method = RequestMethod.GET)
	public @ResponseBody List <Activity>  findAllActivities(){
		List <Activity> activities = new ArrayList <Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		run.setDesc("swim");
		activities.add(swim);
		
		return activities;
		
		
	}
	
	//@RequestMapping(value= "/addMoreMinutes")
	//public  String AddMoreeMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		//System.out.println("exercisesing :"+exercise.getMinutes());
		//return "addMinutes";
	//}

}
