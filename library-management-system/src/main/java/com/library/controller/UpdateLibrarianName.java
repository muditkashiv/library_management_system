package com.library.controller;

import com.library.service.LibrarianService;

public class UpdateLibrarianName {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		if(librarianService.updateLibrarianNameById(6, "pandu")!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("Not Updated");
		}
	}
}
