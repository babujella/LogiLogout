package com.tech.exampleORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Examle.xml");
		StudentDao dao=(StudentDao)applicationContext.getBean("studentdao");
		dao.saveStudent(new Student(1839,"BabuJella"));
		System.out.println("Success.");
	}
}
