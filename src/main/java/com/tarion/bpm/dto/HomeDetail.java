package com.tarion.bpm.dto;

import java.io.Serializable;

public class HomeDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean isUponOrAttached;
	private boolean isBuildInParcelOfLandToCommonElement;
	private boolean isBuildOnVacantLandCondoCorporation;
	private TypeOfHome typeOfHome;
	
	public boolean isUponOrAttached() {
		return isUponOrAttached;
	}
	public void setUponOrAttached(boolean isUponOrAttached) {
		this.isUponOrAttached = isUponOrAttached;
	}
	public boolean isBuildInParcelOfLandToCommonElement() {
		return isBuildInParcelOfLandToCommonElement;
	}
	public void setBuildInParcelOfLandToCommonElement(boolean isBuildInParcelOfLandToCommonElement) {
		this.isBuildInParcelOfLandToCommonElement = isBuildInParcelOfLandToCommonElement;
	}
	public boolean isBuildOnVacantLandCondoCorporation() {
		return isBuildOnVacantLandCondoCorporation;
	}
	public void setBuildOnVacantLandCondoCorporation(boolean isBuildOnVacantLandCondoCorporation) {
		this.isBuildOnVacantLandCondoCorporation = isBuildOnVacantLandCondoCorporation;
	}
	public TypeOfHome getTypeOfHome() {
		return typeOfHome;
	}
	public void setTypeOfHome(TypeOfHome typeOfHome) {
		this.typeOfHome = typeOfHome;
	}
}
