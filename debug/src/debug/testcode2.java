package debug;

public class testcode2
{

	int b;
	int x;
	static int  a1[]= {2,5,7,8,5};
	static int b1[]= {23,43,27,32,12};
	static int x1[]= {18,19,20,21,22};
	
	
	public static void eq()
	{
		int a=0;

		for(int i=0;i<5;i++)
		{
			
					a= (int) ((a1[i]*Math.pow(x1[i], 2))+(b1[i]*Math.pow(x1[i], 2))+(2*a1[i]*b1[i]));
				    System.out.println(a);
			
		}
		
	}
	
	public static void main(String[] args)
	{
		
		eq();
		
		
		
	}

}
