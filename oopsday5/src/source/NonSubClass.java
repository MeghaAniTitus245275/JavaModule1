package source;

public class NonSubClass {

	public NonSubClass()
	{
		Parent p = new Parent();
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);
		
	}
}
