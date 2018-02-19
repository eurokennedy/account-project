
package com.qa.app;

import java.util.HashMap;

public class Service {
	public HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	private int counter = 0;
	
	
	public void addAccount(Account account) {
		counter++;
		hashMap.put(counter, account);
		
	}
	public Account retrieveAccount(int accountNumber) {
		return hashMap.get(accountNumber);	
	}
	
	public HashMap<Integer,Account> gethashMap(){
		//System.out.println(hashMap.get(1).retrieveFirstName());
		return hashMap;
	}
}
