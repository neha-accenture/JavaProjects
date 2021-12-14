package com.demoapiRest.SpringRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoapiRest.SpringRestApi.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
