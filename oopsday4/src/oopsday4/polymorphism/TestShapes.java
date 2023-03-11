package oopsday4.polymorphism;

class A{}
class B extends A{
	
}

public class TestShapes
{
	public static void main(String[] args) {
		
	//B b =new A();       narrowing
		//superclass doesnot about its subclass,parent class cannot do the work of subclass
		
		double d = 10;
		//int   i =d;
		A a  = new B();
		
	Shape s = new Rectangle(10.25,65.75);
	double result  = s.area();
	System.out.println(result);
	
	if(s instanceof Rectangle)
	{
		Rectangle rect  = (Rectangle) s;
	}
	
	 s = new Circle(65.87);
	 result  = s.area();
	System.out.println(result);
	
	 s = new Square(55);
	 result  = s.area();
	System.out.println(result);
	
	Object obj = new String("hello");
	obj = new Integer("10");
	obj = new java.util.Scanner(System.in);
	obj = new Rectangle();
	if(obj instanceof String)
	{
	 String str = (String)obj;
	}
		
	
	
	}
}
