package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.springboot.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
	
}
