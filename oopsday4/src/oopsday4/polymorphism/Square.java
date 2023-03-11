package oopsday4.polymorphism;

public class Square extends Shape {

private double side;
 public Square()
 {
	
 }
	
	
	
	public Square(double side) {
	super();
	this.side = side;
}

	public double getSide()
	{
		return side;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

}
