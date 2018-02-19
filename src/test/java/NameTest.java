import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.Service;
import junit.framework.Assert;
import java.util.Iterator;

public class NameTest {

	public NameTest() {
		// TODO Auto-generated constructor stub
	}
	private int count=0;
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}
	
	
	@Before
	public void setUp() {
	}
	
	@Test
	public void cycleThrough() {
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
		
		service.addAccount(one);
		service.addAccount(two);
		service.addAccount(three);
		
		Iterator iterator = service.hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry)iterator.next();
			Account acc = (Account) pair.getValue();		
			if (acc.getFirstName() == "Joe"){
				count++;
			}
			iterator.remove();
		}
		Assert.assertEquals(2, count);
		System.out.println(count);
	}
	
	
	@After
	public void tearDown() {}
	
	@AfterClass
	public static void setUpAfterClass() {
	}
	

}
