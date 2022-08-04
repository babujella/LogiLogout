package com.tech.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    	ApplicationContext context=new ClassPathXmlApplicationContext("DependencyInjection.xml");
    	Student student=(Student)context.getBean("std");
    	student.myMethod();
        System.out.println("Success");
    }
}
