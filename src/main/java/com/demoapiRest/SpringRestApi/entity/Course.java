package com.demoapiRest.SpringRestApi.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String name;
	private String age;
	
	
	public Course(long id, String name,String age, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



	

	
	
	
	

}
