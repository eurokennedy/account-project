package com.qa.app;
import java.util.Map;
import org.json.JSONObject;
public class App {

	public static void main (String[] args) {
		Account one = new Account();
		one.setAccountNumber(1);
		one.setFirstName("John");
		one.setLastName("Doe");
		
		Service service = new Service();
		service.addAccount(one);
		
		
		Map map = service.gethashMap();
		JSONObject json = new JSONObject(map);
		System.out.println(json);
	}
}

