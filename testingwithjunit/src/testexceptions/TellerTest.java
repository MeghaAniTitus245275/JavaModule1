package testexceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TellerTest {
	
	Teller teller = new Teller();
	
	@Test(expected = IllegalArgumentException.class)
	
	public void testValidateUnacceptedCurrency() {
		teller.validateTransaction("AUSD", 100);
		//fail("Not yet implemented");
	}
	
	
	

	@Test(expected = InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
		teller.validateTransaction("EUR", -100);
		//fail("Not yet implemented");
	}

}
