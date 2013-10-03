package com.simpleprogrammer.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;



//import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EnterProtein extends ActionSupport implements SessionAware {
	
	private int enteredProtein;
	private ProteinData proteinData;
	private Map<String, Object> session;
	
	
	public ProteinData getProteinData() {
		return proteinData;
	}



	public void setProteinData(ProteinData proteinData) {
		this.proteinData = proteinData;
	}



	@Override
	public String execute() throws Exception {
		if(session.containsKey("proteinData"))
			proteinData=(ProteinData) session.get("proteinData");
		
		if(proteinData != null ) 
		{
		ProteinTrackingService proteinTrackingService =new ProteinTrackingService(proteinData);
		proteinTrackingService.AddProtein(enteredProtein);

		}
		else {
			proteinData =new ProteinData();
			proteinData.setTotal(0);
			proteinData.setGoal(300);
		}
		session.put("proteinData",proteinData);
		
		return SUCCESS;
	} 

		

	public int getEnteredProtein() {
		return enteredProtein;
	}


	public void setEnteredProtein(int enteredProtein) {
		this.enteredProtein = enteredProtein;
	}
	
	public String getGoalText() {
		return getText("goal.text");
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public void  resetTotal()
	{
		proteinData.setTotal(0);
	}
	
}
