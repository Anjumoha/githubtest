package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {
	
	
	@GetMapping("/s")
	public String show()
	{
		return "hello";
		
	}
	@GetMapping("/sh")
	public String show1()
	{
		return "hi";
		
	}

}
