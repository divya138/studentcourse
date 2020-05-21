package com.student.student.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.student.dao.StudentRepository;
import com.student.student.exception.UserDefinedException;
import com.student.student.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public void removeStudent(long studentId) {
		studentRepository.deleteById(studentId);

	}

	@Override
	public Student getStudentById(long studentId) {
		Student student = studentRepository.getOne(studentId);
		if (student != null) {
			return student;
		} else {
			throw new UserDefinedException();
		}
	}

	@Override
	public Student getStudentByName(String studentname) {
		return studentRepository.findByStudentName(studentname);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = (List<Student>) studentRepository.findAll();

		if (studentList.size() > 0) {
			return studentList;
		} else {
			return new ArrayList<Student>();
		}
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

}
