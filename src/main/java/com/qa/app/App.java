package com.qa.app;

public class App {

	public static void main (String[] args) {
		Service service = new Service();
		Account one = new Account("John", "Doe", 1);
		service.addAccount(one);
		Account two = service.retrieveAccount(1);
		System.out.println(two.retrieveAccountNumber()); 
	}
}

