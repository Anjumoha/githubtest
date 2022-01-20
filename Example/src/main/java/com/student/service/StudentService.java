package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	
				
				public Student save1(Student login);
				
				public List<Student> findAll1();
				
				public List<Student> findAllOrderByIdDesc1();
				
				public Student findOne1(Integer id);
				
				public List<Student> findByPhoneno(String  Phoneno);
				
				public List<Student> findByNameAndPassword1(String name, String password);
				
				public  List<Student> userLogin(String name,String password);

				public List<Student> findBymark1(String mark1);

				
				public List<Student> findBymark2(String mark2);


		}




