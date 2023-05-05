package com.example.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.studentdetails.Entity.Student;
import com.example.studentdetails.dao.StudentDao;

@Service
public class StudentService {
	@Autowired
	StudentDao studdao;

	public String addstud(Student stud) {
		return studdao.addstud(stud);
	}

	public Student getstud(int id) {
		return studdao.getstud(id);
	}

	public String updatestud(Student id) {
		return studdao.updatestud(id);
	}

	public String deletestud(int id) {
		return studdao.deletestud(id);
	}

	public String addallstud(List<Student> stud) {
		return studdao.addallstud(stud);
	}

	public List<Student> getallstud() {
		return studdao.getallstud();
	}
	public String getname(int rollnumber) {
		return studdao.getname(rollnumber);
	}
	public String getper(int rollnumber) {
		return studdao.getper(rollnumber);
	}
//	public List<Student> getstudbw170and190(int rollnumber) {
//		return studdao.getstudbw170and190(rollnumber);
//	}
	public Student getbyrollnumber(@PathVariable int rollnumber) {
		return studdao.getbyrollnumber(rollnumber);
	}

}
