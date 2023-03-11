package TestLamdas;
//functional interface
interface Shape{
	double area();
//not allowed double perimeter();
	
}



interface Math{
	double power(int b,int e);
}



interface factorial{
	int facto(int n);

	
}
public class Example1 {
	public static void main(String[] args) {
		//every lamda is a placeholder
		
		factorial fact  = (int n)-> {
			int fa =1;
		
			for(int i = 1;i<=n;i++)
			{
				fa*=i;
			}
			return fa ;
		};
		
		System.out.println(fact.facto(5));
		
		
		Runnable r1 = new Runnable() {
			public void run()
			{
				System.out.println("from run method");
			}
			
		};
		
		Runnable r = ()->{
			for(int i =1;i<5;i++)
			{
				System.out.println("In run Method" +i);
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		
		Math m  = (int b,int e)-> {
			int p =1;
			for(int i = 1;i<=e;i++)
			{
				p*=b;
			}
			return p ;
		};
		double p =m.power(2,3);
		System.out.println(p);
		
		
		
		
		
		
		Shape s = () -> {
			return 0.0;//holding the reference of a piece of code returned to interface.
		};
		double result = s.area();
		System.out.println(result);
	}

}
