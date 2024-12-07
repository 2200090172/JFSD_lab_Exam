package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;


public interface StudentService 
{
	public String addstudent(Student st);
	public List<Student> viewallstudents();
}
