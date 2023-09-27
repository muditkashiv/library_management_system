package com.library.controller;

import com.library.service.LibrarianService;

public class IssueBook {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueBookById(5, 3, 1);
		System.out.println(res);
	}
}
