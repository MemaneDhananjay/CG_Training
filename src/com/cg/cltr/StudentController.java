package com.cg.cltr;

import java.util.List;
import com.cg.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.entity.Student;

@Controller
public class StudentController {
@Autowired
 private studentService studentService;

     @RequestMapping(value="/Students",method=RequestMethod.GET,
    		 produces = "application/json")


     @ResponseBody
	public List<Student> getstdDetails()
	{
		
		return studentService.getStudentDetails();
	}
}
