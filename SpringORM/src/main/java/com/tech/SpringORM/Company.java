package com.tech.SpringORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comp_05")
public class Company {
	private int id;
	private String name;
	private String role;
	public Company() {

	}
	public Company(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
