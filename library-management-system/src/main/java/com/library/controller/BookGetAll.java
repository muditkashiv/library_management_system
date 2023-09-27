package com.library.controller;

import java.util.List;

import com.library.dto.Book;
import com.library.service.BookService;

public class BookGetAll {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
		for (Book b : books) {
			System.out.println("==============================");
			System.out.print(b.getId() + " " + "| ");
			System.out.print(b.getName() + " " + "| ");
			System.out.println(b.getStatus() + " " + "| ");
			System.out.println("==============================");

		}
	}

}
