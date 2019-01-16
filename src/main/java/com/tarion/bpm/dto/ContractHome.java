package com.tarion.bpm.dto;

import java.io.Serializable;

public class ContractHome implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean isBuildOnLandCurrentlyOwnedByPurchaser;

	public boolean isBuildOnLandCurrentlyOwnedByPurchaser() {
		return isBuildOnLandCurrentlyOwnedByPurchaser;
	}

	public void setBuildOnLandCurrentlyOwnedByPurchaser(boolean isBuildOnLandCurrentlyOwnedByPurchaser) {
		this.isBuildOnLandCurrentlyOwnedByPurchaser = isBuildOnLandCurrentlyOwnedByPurchaser;
	}

}
