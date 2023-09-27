package com.library.controller;

import com.library.dto.Book;
import com.library.service.BookService;

public class BookGet {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = bookService.getBookById(1);
		System.out.println("==============================");
		System.out.print(book.getId() + " " + "| ");
		System.out.print(book.getName() + " " + "| ");
		System.out.println(book.getStatus() + " " + "| ");
		System.out.println("==============================");

	}
}
