package prime;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

	private final Integer inputNumber;
	private final boolean expectedResult;
	private PrimeNumber primenumber;
	
	@Before
	public void intialize()
	{
		primenumber = new PrimeNumber();
	}
	
	public PrimeNumberTest(Integer inputNumber,Boolean expectedResult)
	{
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers()
	{
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false}
		});
	}
	@Test
	public void testValidator() {
		System.out.println("Parameterized number is "+inputNumber);
		assertEquals(expectedResult,primenumber.validate(inputNumber));
	}

}



	


