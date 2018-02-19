package com.qa.app;
import java.util.Map;
import org.json.JSONObject;
public class App {

	public static void main (String[] args) {
		Account one = new Account();
		one.setAccountNumber(1);
		one.setFirstName("John");
		one.setLastName("Doe");
		
		Account two = new Account();
		two.setAccountNumber(1);
		two.setFirstName("Joe");
		two.setLastName("Doe");
		
		Account three = new Account();
		three.setAccountNumber(1);
		three.setFirstName("Joe");
		three.setLastName("Hill");
		
		Service service = new Service();
		service.addAccount(one);
		
		
		Map map = service.gethashMap();
		JSONObject json = new JSONObject(map);
		System.out.println(json);
	}
}

