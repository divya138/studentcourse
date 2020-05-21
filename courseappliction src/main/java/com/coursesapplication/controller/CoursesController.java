package com.coursesapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coursesapplication.model.Student;
import com.coursesapplication.service.CoursesService;

@RestController
public class CoursesController {
	@Autowired
	CoursesService coursesServices;

	@GetMapping("/{courseId}")
	public String getStudentsByPathVar(@PathVariable int courseId) {
		return coursesServices.getCourseStudentsByCourseId(courseId);
	}

	@GetMapping("/courses")
	public String getCourseStudentsByCourseName(@RequestParam String studentName) {
		return coursesServices.getStudent(studentName);
	}

	@PostMapping("/courses")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		return coursesServices.addStudent(student);
	}
	@GetMapping("/courses/{Id}")
	public String getStudentsByCourseId(@PathVariable int  Id){
		return coursesServices.getCourseStudentsById(Id);
	}
	@GetMapping("/courses2")
	public String getCourseStudentsByName(@RequestParam String studentName){
		return coursesServices.getCoursesByStudentName(studentName);
	}
	@GetMapping("Couresess/{courseId}")
	public String getCourseById( @PathVariable int courseId) {
		return coursesServices.getCourseById(courseId);
		
	}
}
