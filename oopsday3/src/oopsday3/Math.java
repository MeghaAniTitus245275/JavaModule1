package oopsday3;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Math2 prob = new Math2();

int f =prob.factorial(5);
System.out.println("factorial = "+f);
int a = prob.add(3, 4);
System.out.println("add = "+a);
int s = prob.subtract(3, 4);
System.out.println("subtract = "+s);
int m =prob.multiply(3, 4);
System.out.println("multiply = "+m);

prob.evenorodd(4);


	}

}
