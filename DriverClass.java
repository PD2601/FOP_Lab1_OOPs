package com.Lab.Sessions;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Employee First Name:");
		String f = sc.next();
		System.out.println("Please enter Employee Last Name:");
		String l = sc.next();

		Employee emp1 = new Employee(f, l);

		Employee emp2 = new Employee(f, l);
		emp2.setFirstName("Rohit");
		emp2.setLastName("Sharma");

		EmpCredenntialsImpl cred = new EmpCredenntialsImpl();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		System.out.println("Please choose your Department:");
		int choice = sc.nextInt();
		String genEmail = "";
		String genPassword = "";
		switch (choice) {
		case 1:
			genEmail = cred.generateEmailId(emp2.getFirstName().toLowerCase(), emp2.getLastName().toLowerCase(), "technical");
			break;
		case 2:
			genEmail = cred.generateEmailId(emp2.getFirstName().toLowerCase(), emp2.getLastName().toLowerCase(), "admin");
			break;
		case 3:
			genEmail = cred.generateEmailId(emp2.getFirstName().toLowerCase(), emp2.getLastName().toLowerCase(), "humanresource");
			break;
		case 4:
			genEmail = cred.generateEmailId(emp2.getFirstName().toLowerCase(), emp2.getLastName().toLowerCase(), "legal");
			break;
		default:
			System.out.println("Please enter valid Input");
		}

		genPassword = cred.generatePassword();
		emp2.setEmailID(genEmail);
		emp2.setPassword(genPassword);

		cred.showDetails(emp2);
	}
}