package com.library.controller;

import java.util.List;

import com.library.dto.Librarian;
import com.library.service.LibrarianService;

public class LibrarianGetAllController {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		List<Librarian> librarians = librarianService.getAllLibrarians();
		for (Librarian l : librarians) {
			System.out.println("===================================");
			System.out.print(l.getId() + " " + "| ");
			System.out.print(l.getName() + " " + "| ");
			System.out.print(l.getMail() + " " + "| ");
			System.out.println(l.getStatus() + " " + "| ");
			System.out.println("===================================");

		}
	}
}
