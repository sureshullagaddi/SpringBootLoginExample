package com.springboot.phonebill.models;

public class EmployeeAddress {
	
	private String add1;
	private String add2;
	private String landmark;
	
	public EmployeeAddress(String add1, String add2, String landmark) {
		super();
		this.add1 = add1;
		this.add2 = add2;
		this.landmark = landmark;
	}
	
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

}
