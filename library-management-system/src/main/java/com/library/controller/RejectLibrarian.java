package com.library.controller;

import com.library.service.AdminService;

public class RejectLibrarian {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		boolean res = adminService.rejectLibrarianById(5, 2);
		System.out.println(res);
	}

}
