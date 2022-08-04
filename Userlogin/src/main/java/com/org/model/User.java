package com.org.model;

public class User {
	String name;
	String password;
	String DOB;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public void myMetod() {
		System.out.println("Hii "+ name);
	}
}
