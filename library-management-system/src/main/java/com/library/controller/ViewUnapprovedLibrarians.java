package com.library.controller;

import java.util.List;

import com.library.dto.Librarian;
import com.library.service.AdminService;

public class ViewUnapprovedLibrarians {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		List<Librarian> librarians =  adminService.viewAllUnapprovedLibrarians();
		
		for (Librarian l : librarians) {
				System.out.println("=========================");
				System.out.print(l.getId() + " " + "| ");
				System.out.print(l.getName() + " " + "| ");
				System.out.print(l.getMail() + " " + "| ");
				System.out.println(l.getStatus() + " " + "| ");
				System.out.println("=========================");
		}
	}
}
