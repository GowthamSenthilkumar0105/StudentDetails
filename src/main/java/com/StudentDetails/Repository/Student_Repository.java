package com.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentDetails.Entity.Student;

public interface Student_Repository extends JpaRepository<Student, Integer> {

}
