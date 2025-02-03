package com.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Service.AgeException;
import com.StudentDetails.Service.Student_Service;

@RestController
@RequestMapping(value="/students")
public class Student_Controller {
	@Autowired
	Student_Service stdser;
	@PostMapping(value="/addstds")
	public String addStudent(@RequestBody List<Student> s) {
		return stdser.addStudent(s);
	}
	@GetMapping(value="/getstds")
	public List<Student> getStd(){
		return stdser.getStd();
	}
	@PutMapping(value="/update")
	public String update(@RequestBody Student s) {
		return stdser.update(s);
	}
	@DeleteMapping(value="/delstd/{a}")
	public String delstd(@PathVariable int a) {
		return stdser.delstd(a);
	}
	@PostMapping(value="/agerestrict")
	public String ageRestrict(@RequestBody Student s) throws AgeException{
		return stdser.ageRestrict(s);
	}
	@GetMapping(value="/jira")
	public String jira(String jira) {
		return "jira";
	}

}
