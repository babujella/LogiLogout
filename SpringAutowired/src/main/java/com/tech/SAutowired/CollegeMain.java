package com.tech.SAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech.SpringAutowired.Company;

public class CollegeMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		College college=context.getBean("college",College.class);
		college.display();
	}
}
