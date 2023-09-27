package com.library.controller;

import com.library.service.AdminService;

public class AdminDeleteController {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();

		if (adminService.deleteAdminById(5) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}
}
