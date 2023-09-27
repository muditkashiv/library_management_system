package com.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.library.dto.Librarian;

public class LibrarianDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// done
	public Librarian saveLibrarian(Librarian librarian) {
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}

	// done
	public Librarian deleteLibrarianById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		entityTransaction.begin();
		entityManager.remove(librarian);
		entityTransaction.commit();
		return librarian;
	}

	public Librarian updateLibrarianNameById(int id, String newname) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		librarian.setName(newname);
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return librarian;
	}

	public Librarian updateLibrarianMailById(int id, String newmail) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		librarian.setMail(newmail);
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return librarian;
	}

	// done
	public Librarian getLibrarianById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		return librarian;
	}

	// done
	public List<Librarian> getAllLibrarians() {
		String sql = "SELECT l FROM Librarian l";
		Query query = entityManager.createQuery(sql);
		List<Librarian> librarian = query.getResultList();
		return librarian;
	}

	// done
	public boolean approveReject(Librarian librarian) {
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;
	}
}
