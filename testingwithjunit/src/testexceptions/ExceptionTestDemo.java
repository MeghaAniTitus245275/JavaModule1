package testexceptions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExceptionTestDemo {
	
	int a;
	int b;
	int c;
	
	@Before
	public void setUp()
	{
		a=10;
		b=0;
	}
	
	@Test(expected = ArithmeticException.class)


	public void test() {
		c=a/b;
		System.out.println("result="+c);
		//fail("Not yet implemented");
	}

}
