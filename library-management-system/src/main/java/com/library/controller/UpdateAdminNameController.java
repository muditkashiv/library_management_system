package com.library.controller;

import com.library.service.AdminService;

public class UpdateAdminNameController {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();

		if (adminService.updateNameById(5, "admin1") != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	}
}
