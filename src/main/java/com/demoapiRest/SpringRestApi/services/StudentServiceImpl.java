package com.demoapiRest.SpringRestApi.services;

import org.springframework.stereotype.Service;

import com.demoapiRest.SpringRestApi.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student addStudent(Student student) {
//		ObjectMapper objMapper = new ObjectMapper();
		return student;
	}

}
