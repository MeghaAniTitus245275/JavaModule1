package exception;

import java.util.Scanner;

public class exception {
	public static void div(int c,int d) throws ArithmeticException
	{
		if(d==0) {
			throw new ArithmeticException("demo");}
		else
		{
			
			
		
		int e= c/d;
		System.out.println(e);}
		
		
	}

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
//		
		try {
//			
//		System.out.println("program started");
		div( a, b);
	}
	catch(ArithmeticException e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("program ends");
		}
		
	}

}
