package TestLamdas;

public class LambdaSwitchCase {
	
	 double calculate(String operator,double x,double y)
	{
		return switch(operator) {
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" ->{
			if(y==0)
			{
				throw new IllegalArgumentException("cant divide by zero");
			}
			yield x/y;
		}
		default -> throw new IllegalArgumentException("unknown operator");
		};
	}

}
