package com.tech;

import java.util.*;

public class FeedBackMain {
	List<Company> totalFeedbacks=new ArrayList<Company>();
	public void AddFeedBacks(Company company) {
		totalFeedbacks.add(company);
	}
	public List<Company> GetAllfeedbacks() {
		return totalFeedbacks;
	}
	public List<Company> GetFeedbackbyName(String name){
		List<Company> c1=new ArrayList<Company>();
		for(Company f:totalFeedbacks) {
			if(f.getEmployee().equals(name)) 
				c1.add(f);
		}
		return c1;
	}
	public List<Company>GetFeedbackById(int id){
		List<Company> getById=new ArrayList<Company>();
		for(Company GetById :totalFeedbacks) {
			if(GetById.getEmployeeId()==id) 
				getById.add(GetById);
		}
		return getById;
	}
	public List<Company> getByCompanyName(String CompanyName){
		List<Company>getCompany=new ArrayList<Company>();
		for(Company Getcompany:totalFeedbacks) {
			if(Getcompany.getCompanyName().equals(CompanyName))
				getCompany.add(Getcompany);
		}
		return getCompany;
	}
}
