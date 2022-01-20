package com.student.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.student.Responce.StudentResponce;
import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	
	
	
		@Autowired
		private StudentService service;

		@GetMapping("/login")
		public String login(@RequestParam("Id") String id, @RequestParam("name") String name,
				@RequestParam("password") String password,@RequestParam("Phoneno") String Phoneno) {
			System.out.println(id);
			System.out.println(name);
			System.out.println(password);
			System.out.println(Phoneno);
			List<Student> log = service.findByNameAndPassword1(name, password);

			if (log.size() > 0) {
				return "exist";
			} else {
				return "not Exist";

			}
			
		}
		@PostMapping("/savelogin")
		public void savelogin(@RequestBody String payload) throws JsonParseException, JsonMappingException, IOException{
			System.out.println("payload string  "+payload);
			ObjectMapper mapper = new ObjectMapper();
			Student login=mapper.readValue(payload, Student.class);
		service.save1(login);
		}
		@PutMapping("/updatelogin")
	    public StudentResponce updatelogin(@RequestBody String payload) {
	    	
			StudentResponce response = new StudentResponce();
			ObjectMapper mapper = new ObjectMapper();
			try {
				Student login = mapper.readValue(payload, Student.class);
			
				Student loginobj = service.save1(login);
				response.setLogin(loginobj);
				response.setStatusCode(String.valueOf(HttpStatus.OK.value()));
				response.setStatusMessage("data Updated successfully");
				return response;

			} catch (IOException e) {
				StudentResponce response1 = new StudentResponce();
				response1.setStatusCode(String.valueOf(HttpStatus.BAD_GATEWAY));
				response1.setStatusMessage("Error "+e);
				return response;
			}
		}
			
		
}

