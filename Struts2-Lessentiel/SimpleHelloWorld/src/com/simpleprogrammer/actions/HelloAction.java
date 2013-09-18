package com.simpleprogrammer.actions;

import com.opensymphony.xwork2.Action;


public class HelloAction implements Action {
	private String greeting;
	
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	@Override
	public String execute() throws Exception { 
		// TODO Auto-generated method stub
		setGreeting("Hello Struts2 ");
		return "success";
	}

}
