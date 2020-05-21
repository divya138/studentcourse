package com.student.student.controller;

import java.util.List;

import javax.validation.Valid;

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
import com.student.student.model.Student;
import com.student.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/student")
	public Student addUser(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@GetMapping(value = "/studententity")
	public ResponseEntity<List<Student>> getAllStudents(Student student) {
		List<Student> students = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@GetMapping(value = "/student1/{id}")
	public Student getStudent(@PathVariable("id") long id) {
		return studentService.getStudentById(id);

	}

	@PutMapping(value = "/student6")
	public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student) {
		Student updated = studentService.updateStudent(student);
		return new ResponseEntity<Student>(updated, HttpStatus.OK);
	}

	@DeleteMapping(value = "/student/{id}")
	public String deleteStudent(@PathVariable("id") long studentId) {
		studentService.removeStudent(studentId);
		return "Student Deleted";
	}

}
