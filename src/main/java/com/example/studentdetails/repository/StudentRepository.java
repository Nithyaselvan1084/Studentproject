package com.example.studentdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studentdetails.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	@Query(value = "select name from student where rollnumber=?",nativeQuery=true)
	public String getname(int rollnumber);
	@Query(value = "select attendance from student where rollnumber=?",nativeQuery=true)
	public String getper(int rollnumber);
	@Query(value = "select * from student where rollnumber=?",nativeQuery=true)
	public Student getbyrollnumber(int rollnumber);


}
