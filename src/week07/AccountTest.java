package week07;

import org.junit.*;

import static org.junit.Assert.*;



public class AccountTest {	
	private Account testAccount;

	@Before
	public void initialization(){
		this.testAccount = new Account("s123", "Amy", 100.0);
	}

	@After
	public void tearDown(){
		this.testAccount = null;

	}

	@Test
	public void testWithdraw_sufficientBalance() {

		this.testAccount.withdraw(50.0);
		Assert.assertEquals(50.0, this.testAccount.getBalance(), 1e-6);
	}

	@Test
	public void testDeposit_inSufficientBalance() {

		this.testAccount.withdraw(200.0);
		Assert.assertEquals(100.0, this.testAccount.getBalance(), 1e-6);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testAddInterest_NegativeRate(){
		this.testAccount.addInterest(-1.0);
	}



	
	
}