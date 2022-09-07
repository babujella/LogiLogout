package com.tech.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springORM.xml");
		CompanyDao companydao=(CompanyDao)applicationContext.getBean("companydao");
		//companydao.saveCompany(new Company(3,"Kailash","Devoloper"));
		//companydao.updateCompany(new Company(1,"Babu","BackendDevoloper"));
		//companydao.deleteCompanny(new Company(3,"Kailash","Devoloper"));
		System.out.println(companydao.getAllCompanies());
		System.out.println("Done.");
	}
}
