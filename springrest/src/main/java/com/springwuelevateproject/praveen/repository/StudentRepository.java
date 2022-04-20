package com.springwuelevateproject.praveen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springwuelevateproject.praveen.model.Student;

//repository that extends CrudRepository 
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value="select * from students", nativeQuery = true)
	public List<Student> getAllRows();
}
