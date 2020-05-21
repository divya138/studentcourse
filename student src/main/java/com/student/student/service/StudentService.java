package com.student.student.service;

import java.util.List;
import com.student.student.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student createStudent(Student student);

	public void removeStudent(long studentId);

	public Student getStudentById(long studentId);

	public Student getStudentByName(String studentname);

	public Student updateStudent(Student student);

}
