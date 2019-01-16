package com.tarion.bpm.dto;

import java.io.Serializable;

public class EnrolmentObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MunicipalAddress municipalAddress;
	private LegalAddress legalAddress;
	private String estimatedSellingPrice;
	private String sizeInAcres;
	private HomeDetail homeDetail;
	
	public HomeDetail getHomeDetail() {
		return homeDetail;
	}
	public void setHomeDetail(HomeDetail homeDetail) {
		this.homeDetail = homeDetail;
	}
	public String getSizeInAcres() {
		return sizeInAcres;
	}
	public void setSizeInAcres(String sizeInAcres) {
		this.sizeInAcres = sizeInAcres;
	}
	public MunicipalAddress getMunicipalAddress() {
		return municipalAddress;
	}
	public void setMunicipalAddress(MunicipalAddress municipalAddress) {
		this.municipalAddress = municipalAddress;
	}
	public LegalAddress getLegalAddress() {
		return legalAddress;
	}
	public void setLegalAddress(LegalAddress legalAddress) {
		this.legalAddress = legalAddress;
	}
	public String getEstimatedSellingPrice() {
		return estimatedSellingPrice;
	}
	public void setEstimatedSellingPrice(String estimatedSellingPrice) {
		this.estimatedSellingPrice = estimatedSellingPrice;
	}
	
}
