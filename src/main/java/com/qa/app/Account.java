package com.qa.app;

public class Account {
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Account(String first, String last, int accNum) {
		firstName=first;
		lastName=last;
		accountNumber=accNum;
	}

	public String retrieveFirstName(){
		return firstName;
	}
	public String retrieveLastName(){
		return lastName;
	}
	public int retrieveAccountNumber(){
		return accountNumber;
	}
}
