
package com.qa.app;

import java.util.HashMap;

public class Service {
	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	private int counter = 0;
	
	
	public void addAccount(Account account) {
		counter++;
		hashMap.put(counter, account);
		
	}
	public Account retrieveAccount(int accountNumber) {
		return hashMap.get(accountNumber);	
	}
	
	
	
}
