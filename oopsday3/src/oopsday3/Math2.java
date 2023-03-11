package oopsday3;

public class Math2 implements MathIface
{
	private int a;
	private int b;
	private int n;

	public Math2()
	{
		// TODO Auto-generated constructor stub
		
	}
	
public Math2(int a, int b, int n) {
		
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	
	
	
	public double getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public double getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}


	@Override
	public int factorial(int n) 
	{
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
		fact = ( fact * i);
		
		}
		return fact;
	}
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int add =0 ;
		add = a+b;
		return add;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		int sub=0;
		sub=a-b;
		return sub;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub

	int mul=a*b;
	return mul;
	}

	@Override
	public void evenorodd(int n)
	{
		// TODO Auto-generated method stub
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			 System.out.println("odd");
		}
		
	}

}
