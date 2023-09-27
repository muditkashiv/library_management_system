package com.library.controller;

import com.library.dto.Librarian;
import com.library.service.LibrarianService;

public class LibrarianGetController {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = librarianService.getLibrarianById(1);
		System.out.println("===================================");
		System.out.print(librarian.getId() + " " + "| ");
		System.out.print(librarian.getName() + " " + "| ");
		System.out.print(librarian.getMail() + " " + "| ");
		System.out.println(librarian.getStatus() + " " + "| ");
		System.out.println("===================================");
	}
}
