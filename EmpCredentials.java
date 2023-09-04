package com.Lab.Sessions;

public interface EmpCredentials {
	String generateEmailId(String firstName, String lastName, String department);
	String generatePassword();

	void showDetails(Employee e);

}
