package com.tech.springjdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringJdbcmainApp.xml");
		StudentDao stdDao=(StudentDao)applicationContext.getBean("studentdao");
		
	//	int b=stdDao.saveStudent(new Student(1,"Babu","Tenth"));
		int c=stdDao.saveStudent(new Student(1,"Pavan","Sixth"));
	//	System.out.println(b);
		System.out.println(c);
	}
}
