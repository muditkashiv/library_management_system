package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.LibrarianDao;
import com.library.dao.StudentDao;
import com.library.dto.Book;
import com.library.dto.Librarian;
import com.library.dto.Student;

public class LibrarianService {

	LibrarianDao librarianDao = new LibrarianDao();
	BookDao bookDao = new BookDao();
	StudentDao studentDao = new StudentDao();

	// done
	public Librarian saveLibrarian(Librarian librarian) {
		librarian.setStatus("Unapproved");
		return librarianDao.saveLibrarian(librarian);
	}

	// done
	public Librarian deleteLibrarianById(int id) {
		Librarian librarian = getLibrarianById(id);
		if (librarian != null) {
			return librarianDao.deleteLibrarianById(id);
		}
		return null;
	}

	public Librarian updateLibrarianNameById(int id, String newname) {
		Librarian librarian = getLibrarianById(id);
		if (librarian != null) {
			return librarianDao.updateLibrarianNameById(id, newname);
		}
		return null;
	}

	public Librarian updateLibrarianMailById(int id, String newmail) {
		Librarian librarian = getLibrarianById(id);
		if (librarian != null) {
			return librarianDao.updateLibrarianMailById(id, newmail);
		}
		return null;
	}

	public Librarian getLibrarianById(int id) {
		return librarianDao.getLibrarianById(id);
	}

	public List<Librarian> getAllLibrarians() {
		return librarianDao.getAllLibrarians();
	}

	public Boolean addBook(Book book) {
		BookDao bookDao = new BookDao();
		bookDao.saveBook(book);
		return true;
	}

	public Boolean removeBookById(int bookid) {
		BookDao bookDao = new BookDao();
		bookDao.deleteBookById(bookid);
		return true;
	}

	public boolean issueBookById(int bookid, int libid, int studid) {
		Book book = bookDao.getBookById(bookid);
		Student student = studentDao.getStudentById(studid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		if (librarian != null && book != null && student != null) {
			book.setStatus("Issued");
			book.setStudent(student);
			book.setLibrarian(librarian);
			return bookDao.issue(book);
		}
		return false;
	}

	public boolean returnBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		if (book != null && book.getStatus().equals("Issued")) {
			Student student = book.getStudent();
			Librarian librarian = book.getLibrarian();

			if (student != null && librarian != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
		}
		return false;
	}

}
