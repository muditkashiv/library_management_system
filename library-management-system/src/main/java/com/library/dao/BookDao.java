package com.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.library.dto.Book;
import com.library.dto.Librarian;

public class BookDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// done
	public Book saveBook(Book book) {
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	}

	// done
	public Book deleteBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		entityTransaction.begin();
		entityManager.remove(book);
		entityTransaction.commit();
		return book;
	}

	public Book updateBookNameById(int id, String newname) {
		Book book = entityManager.find(Book.class, id);
		book.setName(newname);
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;
	}

	// done
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	// done
	public List<Book> getAllBooks() {
		String sql = "SELECT b FROM Book b";
		Query query = entityManager.createQuery(sql);
		List<Book> books = query.getResultList();
		return books;
	}

	public boolean issue(Book book) {
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return true;

	}

	public boolean returnBook(Book book) {
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return true;
	}
}
