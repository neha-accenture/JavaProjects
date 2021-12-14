package com.demoapiRest.SpringRestApi.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demoapiRest.SpringRestApi.entity.Student;

public interface StudentService {
	public Student addStudent(Student student);

}
