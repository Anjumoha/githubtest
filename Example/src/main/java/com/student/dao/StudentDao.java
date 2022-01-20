
package com.student.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.model.Student;







@Repository
public interface StudentDao extends CrudRepository<Student, Integer>{

			public Student save(Student login);
			
			public List<Student> findAll();
			
			public List<Student> findAllByOrderByIdDesc();
			
			public Student findOne(Integer id);
			
			public List<Student> findBymark1(String mark1);
			
			public List<Student> findBymark2(String mark2);
			public List<Student> findByPhoneno(String  Phoneno);
			
			
			
			public List<Student> findByNameAndPassword(String name, String password);
			
			
			
		}


