package com.tech.SAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
    private Student student;
    
    @Autowired
    @Qualifier("student1")
	public void setStudent(Student student) {
		this.student = student;
	}
	public void display() {
		System.out.println(" Succesfully injected..");
		System.out.println(student.getName());
		System.out.println(student.getStudentRollNo());
	}
    
}
