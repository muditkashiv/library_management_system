package com.library.controller;

import com.library.dto.Admin;
import com.library.service.AdminService;

public class AdminSaveController {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		Admin admin = new Admin();

		admin.setName("admin");
		admin.setUsername("a");
		admin.setPassword("pass123");
		adminService.saveAdmin(admin);
	}
}
