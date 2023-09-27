package com.library.controller;

import com.library.dto.Book;
import com.library.service.BookService;

public class BookSave {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = new Book();
		book.setName("chemistry 360");
		book.setStatus("Issued");
		bookService.saveBook(book);
	}
}
