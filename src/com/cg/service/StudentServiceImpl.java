package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.entity.Student;
@Component
public class StudentServiceImpl implements studentService{
   static List<Student> list_Student = new ArrayList<>();
   static {
	   list_Student.add(new Student(101, "abc", "abc@.com"));
	   list_Student.add(new Student(102, "aba", "mnl@.com"));
	   list_Student.add(new Student(103, "xya", "xyz@.com"));
   }
	@Override
	public List<Student> getStudentDetails() {
		// TODO Auto-generated method stub
		
		return list_Student;
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
		list_Student.add(s);
	}
	

}
