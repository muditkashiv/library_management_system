package com.library.controller;

import java.util.List;

import com.library.dto.Admin;
import com.library.service.AdminService;

public class AdminGetAllController {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		List<Admin> admins = adminService.getAllAdmins();
		for (Admin a : admins) {
			System.out.println("=========================");
			System.out.print(a.getId() + " " + "| ");
			System.out.print(a.getName() + " " + "| ");
			System.out.print(a.getUsername() + " " + "| ");
			System.out.println(a.getPassword() + " " + "| ");
			System.out.println("=========================");

		}
	}
}
