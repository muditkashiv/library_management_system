package com.library.controller;

import com.library.service.BookService;

public class BookUpdate {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		if (bookService.updateBookNameById(1, "Can't Hurt Me") != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	}
}
