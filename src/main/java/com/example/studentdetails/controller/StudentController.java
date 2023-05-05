package com.example.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.studentdetails.Entity.Student;
import com.example.studentdetails.exception.AgeException;
import com.example.studentdetails.service.StudentService;

@RestController

public class StudentController {
	@Autowired
	StudentService studser;
	@Autowired
	RestTemplate rest;

	@PostMapping(value = "/addstudent")
	public String addstud(@RequestBody Student stud) throws AgeException {
		if (stud.getAge() < 18) {
			throw new AgeException();
		} else {
			return studser.addstud(stud);
		}
	}

	@GetMapping(value = "/getstud/{id}")
	public Student getstud(@PathVariable int id) {
		return studser.getstud(id);
	}

	@PutMapping(value = "/updatestud/{id}")
	public String updatestud(@RequestBody Student id) {
		return studser.updatestud(id);
	}

	@DeleteMapping(value = "/deletestud/{id}")
	public String deletestud(@PathVariable int id) {
		return studser.deletestud(id);
	}

	@PostMapping(value = "/addallstudent")
	public String addallstud(@RequestBody List<Student> stud) {
		return studser.addallstud(stud);
	}

	@GetMapping(value = "/getallstud")
	public List<Student> getallstud() {
		return studser.getallstud();
	}
	@GetMapping(value="/getname/{rollnumber}")
	public String getname(@PathVariable int rollnumber) {
		return studser.getname(rollnumber);
	}
	@GetMapping(value="/getattendence/{rollnumber}")
	public String getper(@PathVariable int rollnumber) {
		return studser.getper(rollnumber);
	}
//	@GetMapping(value="/getstudbw170and190/{rollnumber}")
//	public List<Student> getstudbw170and190(@PathVariable int rollnumber) {
//		return studser.getstudbw170and190(rollnumber);
//	}
	@GetMapping(value="/getstudbyrollnumber/{rollnumber}")
	public Student getbyrollnumber(@PathVariable int rollnumber) {
		return studser.getbyrollnumber(rollnumber);
	}
	

}
