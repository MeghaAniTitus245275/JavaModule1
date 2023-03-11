package oopsday4.statictest;

public class StaticDemo2
{
	static int a=10;
	public static void method()
	{
		System.out.println("from method "+a);
		//method2();is non static
	}
	public static void method2()
	{
		System.out.println(a);
		//method();
		
	}
/* public StaticDemo2()
 {
	 class TestInner
	 {
		 
	 }
 }
 static class TestInner{
	 
 }*/
	
}
