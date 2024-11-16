package com.StudentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.StudentDetails.Dao.Student_Dao;
import com.StudentDetails.Entity.Student;

@Service
public class Student_Service {
	@Autowired
	Student_Dao stddao;
	
	public String addStd(List<Student> s) {
		return stddao.addStd(s);
	}
	
	public List<Student> getStd(){
		return stddao.getStd();
	}
	
	public String update(Student s) {
		return stddao.update(s);
	}
	
	public String delstd(int a) {
		return stddao.delstd(a);
	}
	
	public String ageRestrict(Student s) throws AgeException {
		if(s.getAge()>18) {
			return stddao.ageRestrict(s);
		}
		else {
			throw new AgeException("Age Restricted");
		}
	}

}
