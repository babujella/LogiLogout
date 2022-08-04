package com.tech.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("EmployeeData.xml");
		Employee employee=applicationContext.getBean("emp",Employee.class);
		employee.displayEmployeeData();
	}
}
