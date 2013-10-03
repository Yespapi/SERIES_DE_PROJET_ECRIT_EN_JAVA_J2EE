package com.simpleprogrammer.actions;

public class ProteinTrackingService {
	private ProteinData proteinData;

	public ProteinTrackingService(ProteinData proteinData) {
		// TODO Auto-generated constructor stub
		this.proteinData= proteinData;
	}

	public void AddProtein(int proteinData2) {
		// TODO Auto-generated method stub
		proteinData.setTotal(proteinData.getTotal() + proteinData2);
		
	}

}
