package com.example.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.studentdetails.Entity.Student;
import com.example.studentdetails.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository studrepo;

	public String addstud(Student stud) {
		studrepo.save(stud);
		return "success";
	}

	public Student getstud(int id) {
		return studrepo.findById(id).get();
	}

	public String updatestud(Student id) {
		studrepo.save(id);
		return "success";
	}

	public String deletestud(int id) {
		studrepo.deleteById(id);
		return "success";
	}

	public String addallstud(List<Student> stud) {
		studrepo.saveAll(stud);
		return "success";
	}

	public List<Student> getallstud() {
		return studrepo.findAll();
	}
	public String getname(int rollnumber) {
		return studrepo.getname(rollnumber);
	}
	public String getper(int rollnumber) {
		return studrepo.getper(rollnumber);
	}
//	public List<Student> getstudbw170and190(int rollnumber) {
//		return studrepo.getstudbw170and190(rollnumber);
//	}
	public Student getbyrollnumber(@PathVariable int rollnumber) {
		return studrepo.getbyrollnumber(rollnumber);
	}


}
