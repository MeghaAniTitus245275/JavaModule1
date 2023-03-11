package oopsday3point;
import java.awt.Point;
import java.util.Scanner;
import java.util.*;
public class Rummy {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the coordinates of first point:");
		int a =sc.nextInt();
		int b = sc.nextInt();
		points P1 = new points(a,b);
		System.out.println("enter the coordinates of second point:");
	      a =sc.nextInt();
		 b = sc.nextInt();
		 points P2 = new points(a,b);
			System.out.println("Horizontal line");
		     int x = P1.getX();
		     int y = P2.getX();
		     
		     Method m1 =new Method();
		     m1.call(x,y);
		     

	}

}
