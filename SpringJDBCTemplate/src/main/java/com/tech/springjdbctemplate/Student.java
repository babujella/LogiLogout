package com.tech.springjdbctemplate;



public class Student {
	private int id;
	private String name;
	private String standard;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String standard) {
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
}
