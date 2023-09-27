package com.library.controller;

import com.library.service.AdminService;

public class UpdateAdminUsername {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		if (adminService.updateUsernameByIdPass(5, "a3", "password", "password") != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}
}
