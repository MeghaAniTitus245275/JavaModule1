package lsp;

public class LSPDemo {
	public void calculateArea(Shape s)
	{
		System.out.println(s.getArea());
	}
	
	public static void main(String[] args) {
		LSPDemo lsp = new LSPDemo();
		
		lsp.calculateArea(new Rectangle(1,4));
		lsp.calculateArea(new Square(5));
		
		
		
	}

}
