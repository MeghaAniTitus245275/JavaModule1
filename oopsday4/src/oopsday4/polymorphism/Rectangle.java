package oopsday4.polymorphism;

public class Rectangle extends Shape {

	
	private double length;
	private double breadth;
	
	public Rectangle()
	{
		
	}
	public Rectangle(double Length,double breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
		
	}
	public double getLength()
	{
		return length;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getbreadth()
	{
		return breadth;
	}
	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	public double area()
	{
		return this.length*this.breadth;
	}
	

}

