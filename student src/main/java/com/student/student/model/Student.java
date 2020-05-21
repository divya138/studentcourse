package com.student.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private long studentId;
	private String studentName;

	public Student() {
		super();
	}

	public Student(long studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
