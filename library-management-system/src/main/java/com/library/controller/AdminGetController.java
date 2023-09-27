package com.library.controller;

import com.library.dto.Admin;
import com.library.service.AdminService;

public class AdminGetController {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		Admin admin = adminService.getAdminById(2);
		
		System.out.println("=========================");
		System.out.print(admin.getId() + " " + "| ");
		System.out.print(admin.getName() + " " + "| ");
		System.out.print(admin.getUsername() + " " + "| ");
		System.out.println(admin.getPassword() + " " + "| ");
		System.out.println("=========================");
	}
}
