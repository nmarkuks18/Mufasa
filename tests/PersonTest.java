import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PersonTest {
	Mufasa testmufasa;
	Person testperson;
	Account testAccount;
	Authenticate testAuth;
	
	@Before
	public void setup(){
		testperson = EasyMock.createMock(Person.class);
		testmufasa = new Mufasa();
		testAccount = EasyMock.createMock(Account.class);
		testAuth = EasyMock.createMock(Authenticate.class);
		
	}

	@Test
	public void testFirstName() {
		EasyMock.expect(testperson.getFirstName()).andReturn("Jesse");
		EasyMock.replay(testperson);
		testmufasa.setUser(testperson);
		assertEquals("Jesse",testmufasa.getUser().getFirstName());
	}
	@Test
	public void testAccount() {
		EasyMock.expect(testAccount.getBalance()).andReturn(101.1);
		EasyMock.replay(testAccount);
		testmufasa.setAccount(testAccount);
		assertEquals(101.1,testmufasa.getAccount().getBalance(),0.0);
	}
	
	
	@Test
	public void testValidPwd(){			
	Authenticate rightPwd=new Authenticate();//password stub
	Person validPwd=new Person();
	testmufasa.setUser(validPwd);	
	validPwd.setUsername("user1");
	validPwd.setPassword("pwd12345");	
	assertEquals(1,testmufasa.checkPassword(rightPwd));
	}
	@Test
	public void testWrongPwd(){			
	Authenticate WrongPwd=new Authenticate();//password stub
	Person failPwd=new Person();
	testmufasa.setUser(failPwd);	
	failPwd.setUsername("user1");
	failPwd.setPassword("pwd999");	
	assertEquals(2,testmufasa.checkPassword(WrongPwd));
	}
	

}

