package oopsday4.composition;

public class A 
{
	private int x;
	private int y;
	//if it is  made private then it will not be accessible to b class
	
	A()
	{
		System.out.println("from A()");
	}
	public A(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
		System.out.println("from A(int,int)");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
