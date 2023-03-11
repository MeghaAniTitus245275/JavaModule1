package oopsday2shape;

public class Rec implements ShapeIRec {
	private double l;
	private double b;
	
	public Rec()
	{
	
	}
	
	public Rec(double l,double b)
	{
		this.l = l;
		this.b= b;
	}
	
	

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public void Area() 
	{
		// TODO Auto-generated method stub
		if(l>0 && b>0)
		{
			System.out.println("area = "+l*b);
	 }}

	@Override
	public String toString() {
		return "Rec [l=" + l + ", b=" + b + "]";
	}
	
	

}