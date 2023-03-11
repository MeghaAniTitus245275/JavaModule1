package oopsday6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int d = 10/0;
		//throw new ArithmeticException("cannot / by 0");
		
		
		System.out.println("program task begins..");
	
		try {
			Scanner sc  = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
		int c= a/b;//POINT OF EXCEPTION.
		System.out.println(c);
		}catch(ArithmeticException  e)
		{
			System.out.println("cannot / by 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid input format");
		}
		
System.out.println("program completed task...");
	}

}
