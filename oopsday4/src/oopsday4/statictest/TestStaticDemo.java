package oopsday4.statictest;

public class TestStaticDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.a);
		StaticDemo d = new StaticDemo();
		System.out.println(d.a);
		StaticDemo d1 = new StaticDemo();
		System.out.println(d1.a);
		StaticDemo d2 = new StaticDemo();
		System.out.println(d2.a);
		System.out.println(StaticDemo.a);
		/*d.a = 20;
		System.out.println(d1.a);
		d1.a++;
		System.out.println(d.a);*/

	}

}
