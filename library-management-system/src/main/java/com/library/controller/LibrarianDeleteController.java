package com.library.controller;

import com.library.service.LibrarianService;

public class LibrarianDeleteController {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		if (librarianService.deleteLibrarianById(7) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}
}
