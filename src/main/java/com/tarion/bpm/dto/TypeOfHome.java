package com.tarion.bpm.dto;

public enum TypeOfHome {

	DETACHED("Detached"),
	DUPLEX("Duplex"),
	LINKED("Linked"),
	MANUFACTURED("Manufactured"),
	SEMI_DETACHED("Semi Detached"),
	TOWNHOUSE("Townhouse");
	
	private TypeOfHome(String typeOfHome) {
		this.typeOfHome = typeOfHome;
	}
	
	private String typeOfHome;
	
	public String getTypeOfHome() {
		return typeOfHome;
	}
	
}
