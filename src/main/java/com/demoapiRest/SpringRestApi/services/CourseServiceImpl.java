package com.demoapiRest.SpringRestApi.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoapiRest.SpringRestApi.dao.CourseDao;
import com.demoapiRest.SpringRestApi.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	
	public CourseServiceImpl() {}


	@Override
	public List<Course> getCourses() {
//		return list;
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	

}
