package com.springwuelevateproject.praveen.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwuelevateproject.praveen.model.Student;
import com.springwuelevateproject.praveen.repository.StudentRepository;

@Service
public class StudentServiceimplements implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository; 
	
	List<Student> list;
      public StudentServiceimplements() {
    	  list=new ArrayList<>();
    	  list.add(new Student(2014,"praveen","mechanical"));
    	  list.add(new Student(2015,"naveen","computer science"));
    	  
      }
	@Override
	public List<Student> getstudents() {
		
		return list;
	}
	@Override
	public Student getstudentsById(int studentid) {
	
		return null;
	}
	@Override
	public void saveOrUpdate(Student student) {
	 //we need to save details in database
		studentRepository.save(student);
		
	}
	@Override
	public List<Student> getAllStudents(){
		List<Student> list = studentRepository.getAllRows();
		return list;
//		return studentRepository.getAllRows();
	}

	}
	


