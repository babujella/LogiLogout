package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	static Scanner scanner=new Scanner(System.in);
	public static Company InsertObj() {
		Company company=new Company();
		System.out.println("Enter company Name :");
		company.setCompanyName(scanner.next());
		System.out.println("Enter EmployeeId :");
		company.setEmployeeId(scanner.nextInt());
		System.out.println("Enter EmployeeName :");
		company.setEmployee(scanner.next());
		return company;
	}
	public void  GettingObj(Company company) {
		System.out.println("Company name :"+ company.getCompanyName());
		System.out.println("Emploeename :"+ company.getEmployee());
		System.out.println("EmployeeId :"+ company.getEmployeeId());
	}

	public static void main(String[] args) {
		FeedBackMain feedBackMain=new FeedBackMain();
		while(true) {
			System.out.println("Enter ur choice :");
			System.out.println("1-Add feedback \n 2-Show all Feedbacks \n 3-Exit \n 4-EmployeeByName \n 5-EmployeeById  \n 6-EmployeeByCompany");
			int option=scanner.nextInt();
			if(option==3) {
				System.out.println("Thanks for choosing our Application...");
				break;
			}
			else if(option==1) {
				feedBackMain.AddFeedBacks(InsertObj());
			}
			else if(option==2){
				List<Company> fbm=feedBackMain.GetAllfeedbacks();
				for(Company i:fbm) {
					System.out.println(i.CompanyName +"\n"+i.Employee+" \n"+i.EmployeeId);
				}
			}
			else if(option==4) {
				System.out.println("Enter Name that u Want  :");
				List<Company> l1=feedBackMain.GetFeedbackbyName(scanner.next());
				for(Company l2:l1) {
					System.out.println(l2.CompanyName+"\n"+l2.EmployeeId);
				}
			}
			else if(option==5) {
				System.out.println("Enter Id that u want :");
				List<Company> gettingById=feedBackMain.GetFeedbackById(scanner.nextInt());
				for(Company GettingByID :gettingById) {
					System.out.println(GettingByID.CompanyName+"\n"+GettingByID.Employee);
				}
			}
			else if(option==6) {
				System.out.println("Enyter company name :");
				List<Company> getcompany=feedBackMain.getByCompanyName(scanner.next());
				for(Company GetByCompany:getcompany) {
					System.out.println(GetByCompany.Employee+"\n"+GetByCompany.EmployeeId);
				}
			}
		}
	}
}
