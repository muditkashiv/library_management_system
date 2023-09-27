package com.library.service;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.AdminDao;
import com.library.dao.LibrarianDao;
import com.library.dto.Admin;
import com.library.dto.Librarian;

public class AdminService {

	AdminDao adminDao = new AdminDao();
	LibrarianDao librarianDao = new LibrarianDao();

	// done
	public Admin saveAdmin(Admin admin) {
		return adminDao.saveAdmin(admin);
	}

	// done
	public Admin deleteAdminById(int id) {
		Admin admin = getAdminById(id);
		if (admin != null) {
			return adminDao.deleteAdminById(id);
		}
		return null;
	}

	public Admin updateNameById(int id, String newname) {
		Admin admin = getAdminById(id);
		if (admin != null) {
			return adminDao.updateNameById(id, newname);
		}
		return null;
	}

	public Admin updateUsernameByIdPass(int id, String username, String password, String newusername) {
		if (validateAdmin(id, username, password) == true) {
			Admin admin = getAdminById(id);
			if (admin != null) {
				return adminDao.updateUsernameByIdPass(id, newusername);
			}
		}
		return null;
	}

	public Admin updatePasswordByIdPass(int id, String username, String password, String newpassword) {
		if (validateAdmin(id, username, password) == true) {
			Admin admin = getAdminById(id);
			if (admin != null) {
				return adminDao.updatePasswordByIdPass(id, newpassword);
			}
		}
		return null;
	}

	// done
	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}

	// done
	public List<Admin> getAllAdmins() {
		return adminDao.getAllAdmins();
	}

	// done
	public boolean validateAdmin(int id, String loginusername, String loginpassword) {
		Admin admin = adminDao.getAdminById(id);
		if (admin.getUsername().equals(loginusername) && admin.getPassword().equals(loginpassword)) {
			return true;
		} else {
			return false;
		}
	}

	// done
	public boolean approveLibrarianById(int libid, int adminid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);
		Admin admin = adminDao.getAdminById(adminid);
		if (librarian != null && admin != null) {
			librarian.setStatus("Approved");
			librarian.setAdmin(admin);
			return librarianDao.approveReject(librarian);
		}
		return false;
	}

	// done
	public boolean rejectLibrarianById(int libid, int adminid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);
		Admin admin = adminDao.getAdminById(adminid);
		if (librarian != null && admin != null) {
			librarian.setStatus("Rejected");
			librarian.setAdmin(admin);
			return librarianDao.approveReject(librarian);
		}
		return false;
	}

	// done
	public List<Librarian> viewAllUnapprovedLibrarians() {
		LibrarianService librarianService = new LibrarianService();
		List<Librarian> librarians = librarianService.getAllLibrarians();
		List<Librarian> unapprovedLibs = new ArrayList<Librarian>();
		for (Librarian librarian : librarians) {
			if (librarian.getStatus().equals("Unapproved")) {
				unapprovedLibs.add(librarian);
			}
		}
		return unapprovedLibs;
	}
}
