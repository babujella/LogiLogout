package com.tech.SpringAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Auto.xml");
		Company company=context.getBean("company",Company.class);
		company.display();
	}
}
