package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;
	
	@Override
	public String addstudent(Student st) {
		repository.save(st);
		return "Student Added Successfully";
	}

	@Override
	public List<Student> viewallstudents() {
		return (List<Student>) repository.findAll();
	}

}
