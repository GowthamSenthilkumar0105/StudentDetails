package com.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Repository.Student_Repository;

@Repository
public class Student_Dao {
	@Autowired
	Student_Repository stdrepo;
	
	public String addStudent(List<Student> s) {
		stdrepo.saveAll(s);
		return "Added successfully";
	}
	
	public List<Student> getStd(){
		return stdrepo.findAll();
	}
	
	public String update(Student s) {
		stdrepo.save(s);
		return "update successfully";
	}
	
	public String delstd(int a) {
		stdrepo.deleteById(a);
		return "deleted";
	}
	
	public String ageRestrict(Student s) {
		stdrepo.save(s);
		return "successfully added";
	}

}
