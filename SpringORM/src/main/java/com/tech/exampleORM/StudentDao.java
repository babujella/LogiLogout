package com.tech.exampleORM;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
	 HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void saveStudent(Student student) {
		hibernateTemplate.save(student);
	}
	public void updateStuddent(Student student) {
		hibernateTemplate.update(student);
	}
}
