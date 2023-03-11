package oopsday6;

import java.util.InputMismatchException;

public class exception2 {
	public static void main(String[] args) {
		
		System.out.println("program started..");
		
		try {
			
		

		int b = Integer.parseInt(args[0]);            //args command line argument
		int a = Integer.parseInt(args[1]);
		int c= b/a;
		String name = args[2];
		int data[] = { a, b };
		
		
	}catch(ArrayIndexOutOfBoundsException  e)
	{
		e.printStackTrace();
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
		System.out.println("program task completed..");
	}
}
