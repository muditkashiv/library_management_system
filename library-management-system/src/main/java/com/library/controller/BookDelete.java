package com.library.controller;

import com.library.service.BookService;

public class BookDelete {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		if (bookService.deleteBookById(6) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}
}
