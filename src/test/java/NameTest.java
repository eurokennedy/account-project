import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.Service;

import junit.framework.Assert;

public class NameTest {

	public NameTest() {
		// TODO Auto-generated constructor stub
	}
	private int count=0;
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}
	
	
	@Before
	public static void setUp() {
	}
	
	@Test
	public void cycleThrough(String firstName) {
		Service service = new Service();
		Account one = new Account();
		one.setAccountNumber(1);
		one.setFirstName("John");
		one.setLastName("Doe");
		
		Account two = new Account();
		two.setAccountNumber(2);
		two.setFirstName("Joe");
		two.setLastName("Doe");
		
		Account three = new Account();
		three.setAccountNumber(3);
		three.setFirstName("Joe");
		three.setLastName("Hill");
		for (Object value : service.hashMap.values());
		if (Account.firstName = "Joe"){
				count++;
		}
		Assert.assertEquals(2, count);
	}
	
	@After
	
	
	@AfterClass
	public static void setUpAfterClass() {
	}
	

}
