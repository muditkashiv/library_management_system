package com.library.controller;

import com.library.dto.Student;
import com.library.service.StudentService;

public class StudentSave {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = new Student();

		student.setName("vipul");
		student.setMail("voyy@mail.com");

		studentService.saveStudent(student);
	}
}
