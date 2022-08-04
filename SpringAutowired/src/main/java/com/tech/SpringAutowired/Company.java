package com.tech.SpringAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
    private Employee employee;
    
    @Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void display() {
		System.out.println(" Succesfully injected..");
	}
    
}
