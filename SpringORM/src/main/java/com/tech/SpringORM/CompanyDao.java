package com.tech.SpringORM;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.*;

import javax.transaction.Transactional;

public class CompanyDao {
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	 @Transactional
	public void saveCompany(Company company) {
		hibernateTemplate.save(company);
	}
	 @Transactional
	public void updateCompany(Company company) {
		hibernateTemplate.update(company);
	}
	 @Transactional 
	public void deleteCompanny(Company company) {
		hibernateTemplate.delete(company);
	}
	 @Transactional
	public List<Company> getAllCompanies(){
		List<Company> companyList=new ArrayList<Company>();
		companyList=hibernateTemplate.loadAll(Company.class);
		
		return companyList;
	}
}
