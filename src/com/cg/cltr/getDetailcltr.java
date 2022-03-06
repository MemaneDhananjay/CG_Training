package com.cg.cltr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class getDetailcltr {
	
	//initial method for the getails form
@RequestMapping("/getdetail")
	public String getDetail()
	{
		return "getdetails";
	}
	

@RequestMapping("/Filldetail")
public String fillDetail() {
	return "filldetails";
	
}
@RequestMapping("/")
// mapping the method the the actual method to getting all type of request getmapping ,postmapping
public String ShowPage()
{
	return "Login_Page"; 
}

	
}