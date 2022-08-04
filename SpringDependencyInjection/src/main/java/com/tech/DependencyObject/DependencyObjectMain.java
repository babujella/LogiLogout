package com.tech.DependencyObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyObjectMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFileDO.xml");
		Employee emp=context.getBean("employee",Employee.class);
		emp.toString();
	}
}
