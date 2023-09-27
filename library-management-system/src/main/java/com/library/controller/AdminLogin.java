package com.library.controller;

import com.library.service.AdminService;

public class AdminLogin {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();

		boolean flag = adminService.validateAdmin(1, "jay", "abcd");

		if (flag) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Invalid Credentials");
		}

	}
}
