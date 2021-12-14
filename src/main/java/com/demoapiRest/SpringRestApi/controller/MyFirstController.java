package com.demoapiRest.SpringRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoapiRest.SpringRestApi.entity.Course;
import com.demoapiRest.SpringRestApi.entity.Data;
import com.demoapiRest.SpringRestApi.entity.Student;
import com.demoapiRest.SpringRestApi.services.CourseService;
import com.demoapiRest.SpringRestApi.services.DifferentDataInput;
import com.demoapiRest.SpringRestApi.services.StudentService;

@RestController
public class MyFirstController {
	
	@Autowired
	private CourseService courseService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private DifferentDataInput differentData;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//get list of courses
	@GetMapping("/courses")
	public List<Course> getCourse(){
		System.out.print(this.courseService.getClass());
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourses(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PostMapping("/studentdata")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	
	@PostMapping("/differentInput")
	public Object postData(@RequestBody Object data){
		System.out.println(data.getClass().getSimpleName());
		return this.differentData.dataToPost(data);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
