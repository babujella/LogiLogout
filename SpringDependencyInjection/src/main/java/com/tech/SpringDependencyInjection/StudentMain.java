package com.tech.SpringDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main( String[] args ) {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StdentData.xml");
    	Student st=applicationContext.getBean("Student",Student.class);
    	st.displayStudentData();
    	Student st1=applicationContext.getBean("Student1",Student.class);
    	st1.displayStudentData();
    	Student st2=applicationContext.getBean("Student2",Student.class);
    	st2.displayStudentData();
    }
}


/*
 * <!-- providing property spring will realise devoloper write a setter method
 * to inject this dependency -->
 *  <!-- by providing this proprty field we tell to
 * spring hey inject this value to the partiular dependency -->
 */