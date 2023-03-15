package firsttest;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestCalculator {

	
	Calculator calc = new Calculator();
	@Test
	public void testPowerZero() {
		//fail("Not yet implemented");
		
		int inputBase =0;
		int exp = 0;
		int expectedValue = 0;
		int actualValue = calc.power(inputBase, expectedValue);
		assertEquals(expectedValue,actualValue);
	}


	@Test
	public void testPower() {
		//fail("Not yet implemented");	
	int inputBase =2;
		int exp = 3;
		int expectedValue = 8;
		int actualValue = calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
	}
	
	
}
