package com.tech.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		//ApplicationContext is a IOC container Interface too and ClassPathXmlApplicationContext Is the implemented class of ApplicationContext.
		//And this ClassPathXmlApplicationContext will load the xml file  and search for classes in the xml file 
		//and creates Object for the classses and kept in IOC container(ApplicationContext)  and the objects called Beans 
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Companie.xml");
	//	it will cast to the Company class
		//Get bean method is used to get bean from configuration file.
		Company company=(Company)applicationContext.getBean("CompanyObject");
		company.Devoloper();
		company.Testing();
	}
}
