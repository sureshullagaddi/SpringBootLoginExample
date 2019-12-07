package com.springboot.phonebill.models;

public class Employee {
	
	private String name;
	private String eid;
	private String orgName;
	private String dept;
	private String add1;
	private String add2;
	private String landmark;
	//public EmployeeAddress add;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
//	public EmployeeAddress getAdd() {
//		return add;
//	}
//	public void setAdd(EmployeeAddress add) {
//		this.add = add;
//	}
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
