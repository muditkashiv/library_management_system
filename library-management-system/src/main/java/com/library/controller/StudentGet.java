package com.library.controller;

import com.library.dto.Student;
import com.library.service.StudentService;

public class StudentGet {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(1);
		System.out.println("==============================");
		System.out.print(student.getId() + " " + "| ");
		System.out.print(student.getName() + " " + "| ");
		System.out.println(student.getMail() + " " + "| ");
		System.out.println("==============================");
	}
}
