package com.StudentDetails.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<String> handleAge(AgeException ae){
		return new ResponseEntity<>("Age is Restricted",HttpStatus.BAD_REQUEST);
	}

}
