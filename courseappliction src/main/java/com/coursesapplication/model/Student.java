package com.coursesapplication.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId;
	
	private String studentName;
	private List<Courses> courses=new ArrayList<Courses>();
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	public Student() {
		super();
	}
	public Student(String studentName, List<Courses> courses) {
		super();
		this.studentName = studentName;
		this.courses = courses;
	}
	
	
	


}
