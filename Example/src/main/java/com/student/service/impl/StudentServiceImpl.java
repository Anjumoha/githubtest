package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
	
	

				@Autowired
				private StudentDao dao;
					
					@Override
					public Student save1(Student login) {
						Student student=	dao.save(login);
						return student;
					}

					@Override
					public List<Student> findAll1() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public List<Student> findAllOrderByIdDesc1() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public Student findOne1(Integer id) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public List<Student> findByPhoneno(String Phoneno) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public List<Student> findByNameAndPassword1(String name, String password) {
						List<Student> stdnt=	dao.findByNameAndPassword(name, password);
						return stdnt;
					}

					@Override
					public List<Student> userLogin(String name, String password) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public List<Student> findBymark1(String mark1) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public List<Student> findBymark2(String mark2) {
						// TODO Auto-generated method stub
						return null;
					
					}
}
	





