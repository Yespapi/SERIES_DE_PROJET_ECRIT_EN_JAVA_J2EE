package com.yespapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yespapi.model.Activity;


@Service("exercice service")
public class ExerciseServiceImpl {
	
	public List<Activity> findAllActivities() {
		  List<Activity> activities =new ArrayList<Activity>();
		  
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
	
	

}
