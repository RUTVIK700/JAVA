package com.spring.rest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.springrest.entities.Course;
import com.spring.rest.springrest.service.CourseService;


@RestController
public class MyController {
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Courses Application";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/course/{courseid}")
	public Optional<Course> getCourse(@PathVariable String courseid) {
		return this.courseservice.getCourse(Long.parseLong(courseid));
	}
	
	@PostMapping("/course")
		public Course addCourse(@RequestBody Course course) {
			return this.courseservice.addCourse(course);
		}
	@PutMapping("/course")
	public Course UpdateCourse(@RequestBody Course course) {
		return this.courseservice.UpdateCourse(course);
	}
	
	@DeleteMapping("/course/{courseid}")
	public ResponseEntity<HttpStatus> DeleteCourse(@PathVariable String courseid) {
		try {
			this.courseservice.DeleteCourse(Long.parseLong(courseid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}