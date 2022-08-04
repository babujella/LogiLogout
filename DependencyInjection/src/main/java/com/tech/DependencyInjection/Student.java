package com.tech.DependencyInjection;

public class Student {
	private int Id;
	private String name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void myMethod() {
		System.out.println(Id+" "+name);
	}
}
