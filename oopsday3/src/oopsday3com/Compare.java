package oopsday3com;

public class Compare {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		//compare primitives
		
		int a=10;
		int b =35;
		
		boolean result =a==b;//are they same or equal?

		System.out.println(result);  //false
		
		
		
		//comparing objects 
		//1.comparing references
		//2.comparing members
		
		result = r1 == r2;
		System.out.println(result);  //false
		
		result = t1 == t2;
		System.out.println(result);  //false
		
		//result = r1 == t2; //incompatible
		
		Rectangle r3 = r1;
		result = r3==r1;
		System.out.println(result);//true
		System.out.println(r1.hashCode());//1211888640
		
		System.out.println(r3.hashCode()); //1211888640
		
		System.out.println(r2.hashCode()); //564160838
		
		result = r1.equals(r2);//not applicable for primitives
		System.out.println(result); //false
		
		result = r1.equals(r3);
		System.out.println(result); //true
		
		r1.setLength(35.5);
		r1.setBreadth(75.45);
		
		r2.setLength(35.5);
		r2.setBreadth(75.45);
		
		if(r1.getBreadth() == r2.getBreadth() && r1.getLength()==r2.getLength())
		{
			System.out.println("they have same length and breadth");
		}
		else
		{
			System.out.println("they dont have same breadth and length");
		}

		t1.setS1(35.5);
		t1.setS2(45.5);
		t1.setS3(75.5);
		
		//we are not comparing objects r1 and t1
		//we  are comparing data members of two objects
		
		if(r1.getLength() == t1.getS1())
		{
			System.out.println("the length and s1 are same");
		}
		else
		{
			System.out.println("they are not same");
		}
		
	}

}
