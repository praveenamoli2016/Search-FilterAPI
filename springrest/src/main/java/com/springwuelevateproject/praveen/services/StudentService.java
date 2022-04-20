package com.springwuelevateproject.praveen.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;


import com.springwuelevateproject.praveen.model.Student;

public interface StudentService {
	public List<Student>getstudents();

	public Student getstudentsById(int studentid);

	public void saveOrUpdate(Student student);

	public List<Student> getAllStudents();
	

}
