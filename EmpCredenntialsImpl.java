package com.Lab.Sessions;

import java.util.Random;

public class EmpCredenntialsImpl implements EmpCredentials {

	@Override
	public String generateEmailId(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + "gl.com";
	}

	@Override
	public String generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "1234567890";
		String splchars = "!@#$%^&*()";

		String combined = caps + lower + nums + splchars;
		String pass = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			pass = pass + String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return pass;
	}

	@Override
	public void showDetails(Employee e) {
		System.out.println("Employee Firstname is " + e.getFirstName());
		System.out.println("Employee Lastname is " + e.getLastName());
		System.out.println("Employee EmailID is " + e.getEmailID());
		System.out.println("Employee Password is " + e.getPassword());

	}

}
