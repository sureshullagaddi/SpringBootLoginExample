package com.springboot.loginexample.model;

public class User {
	
	

	private String name;  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;  
	
	
	private int uid;
	private String usname;
	private String loginname;
	private String password;
	private String type;
	private String phoneno;
	//private String email;
	//need to impl
	
}
