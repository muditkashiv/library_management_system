package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dto.Book;

public class BookService {
	BookDao bookDao = new BookDao();

	// done
	public Book saveBook(Book book) {
		book.setStatus("Avaliable");
		return bookDao.saveBook(book);
	}

	// done
	public Book deleteBookById(int id) {
		Book book = getBookById(id);
		if (book != null) {
			return bookDao.deleteBookById(id);
		}
		return null;
	}

	public Book updateBookNameById(int id, String newname) {
		Book book = getBookById(id);
		if (book != null) {
			return bookDao.updateBookNameById(id, newname);
		}
		return null;
	}

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}
	
	
}
