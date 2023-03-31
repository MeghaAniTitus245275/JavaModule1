package lsp;

public abstract class Rectangle implements Shape{
	
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @return the breadth
	 */
	public int getBreadth() {
		return breadth;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getArea()
	{
		return this.length*this.breadth;
	}
}
