package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Student;

@Service
public interface studentService {

	public List<Student> getStudentDetails();
	public void addStudent(Student s);

}
