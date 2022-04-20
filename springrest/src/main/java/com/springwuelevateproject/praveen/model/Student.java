package com.springwuelevateproject.praveen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name="students")
public class Student {
	//Defining book id as primary key  
	@Id    
	private int id;
	@Column
	private String name;
	@Column
	private String department;
	public Student(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
//	@Override
//	public String toString() {
//		return "students [id=" + id + ", name=" + name + ", department=" + department + "]";
//	}
}
