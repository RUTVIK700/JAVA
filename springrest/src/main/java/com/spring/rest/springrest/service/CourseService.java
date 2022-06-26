package com.spring.rest.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.spring.rest.springrest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Optional<Course> getCourse(long courseid);
	public Course addCourse(Course course);
	public Course UpdateCourse(Course course);
	public ResponseEntity<HttpStatus> DeleteCourse(long courseid);
}
