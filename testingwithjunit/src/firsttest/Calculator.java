package firsttest;

public class Calculator {
	
	public int power(int b,int e)
	{
		int p=1;
		int i=1;
		if(b == 0 || e ==0)
		{
			return 0;
		}
		else
		{
			while(i<=e)
			{
				p*=b;
				i++;
			}
		}
		return p;
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int c,int d)
	{
		return c-d;
	}
	

}
