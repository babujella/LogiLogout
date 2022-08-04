package com.tech.springjdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student student) {
		String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getStandard()+"')";

		//student.getId() +""+student.getName()+student.getStandard();
		return jdbcTemplate.update(query);
	}
	public int updateStudent(Student student) {
		String query=student.getName()+student.getId()+student.getStandard();
		return jdbcTemplate.update(query);
	}
}
