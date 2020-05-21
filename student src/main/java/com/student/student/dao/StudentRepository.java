package com.student.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findByStudentName(String studentName);

}
