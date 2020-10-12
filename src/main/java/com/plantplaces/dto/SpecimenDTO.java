package com.plantplaces.dto;

public class SpecimenDTO {
	private int specimenId;
	private String lalitude;
	private String longitude;
	private String description;
	
	public int getSpecimenId() {
		return specimenId;
	}
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	public String getLalitude() {
		return lalitude;
	}
	public void setLalitude(String lalitude) {
		this.lalitude = lalitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenId + " " + longitude + " " + lalitude  + " " + description   ;
	}
	
	
}
