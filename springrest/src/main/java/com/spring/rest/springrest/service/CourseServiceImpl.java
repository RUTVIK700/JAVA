package com.spring.rest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.rest.springrest.dao.CourseDao;
import com.spring.rest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao  coursedao;

	//List<Course> list;
	public CourseServiceImpl() {
		/*
		 * list=new ArrayList<>(); list.add(new
		 * Course(145,"Java Book","Good Book for java")); list.add(new
		 * Course(45,"python Book","Good Book for python"));
		 */}

	@Override
	public List<Course> getCourses() {
		return coursedao.findAll();
		//return list;
	}


	@Override
	public Optional<Course> getCourse(long courseid) {
		
		return coursedao.findById(courseid);
		/*
		 * Course c=null; for(Course i:list) { if(i.getId()==courseid) { c=i; break; } }
		 * return c;
		 */}

	@Override
	public Course addCourse(Course course) {
		return coursedao.save(course);
		/*
		 * list.add(course); return course;
		 */}

	@Override
	public Course UpdateCourse(Course course) {
		
		return coursedao.save(course);
		/*
		 * for(Course l:list) { if(course.getId()==l.getId()) {
		 * l.setTitle(course.getTitle()); l.setDescription(course.getDescription());
		 * break;
		 * 
		 * } } return course;
		 */}

	@Override
	public ResponseEntity<HttpStatus> DeleteCourse(long courseid) {
		@SuppressWarnings("deprecation")
		Course entity=coursedao.getReferenceById(courseid);
		 coursedao.delete(entity);
		 return null;
		/*for(Course i:list) {
			if(i.getId()==courseid) {
				list.remove(i);
				break;
			}
		}
		ResponseEntity<HttpStatus> i=null;
		return i;
	*/}

}
