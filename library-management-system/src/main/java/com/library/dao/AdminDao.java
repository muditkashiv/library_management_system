package com.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.library.dto.Admin;
import com.library.dto.Librarian;

public class AdminDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// done
	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}

	// done
	public Admin deleteAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		entityTransaction.begin();
		entityManager.remove(admin);
		entityTransaction.commit();
		return admin;
	}

	// done
	public Admin updateNameById(int id, String newname) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setName(newname);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return admin;
	}

	// done
	public Admin updateUsernameByIdPass(int id, String newusername) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setUsername(newusername);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return admin;
	}

	// done
	public Admin updatePasswordByIdPass(int id, String newpassword) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setPassword(newpassword);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return admin;
	}

	// done
	public Admin getAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	// done
	public List<Admin> getAllAdmins() {
		String sql = "SELECT a FROM Admin a";
		Query query = entityManager.createQuery(sql);
		List<Admin> admins = query.getResultList();
		return admins;
	}

}
