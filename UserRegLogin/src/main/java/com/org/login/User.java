package com.org.login;

public class User {
	String Name;
	String Password;
	String DOB;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public void myMethod() {
		System.out.println("Hiii "+ Name);
	}
}
