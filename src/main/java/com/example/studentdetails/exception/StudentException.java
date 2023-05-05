package com.example.studentdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> studAge(){
			return new ResponseEntity<>("Age Must Be Above 18",HttpStatus.NOT_FOUND);
		
	}

}
