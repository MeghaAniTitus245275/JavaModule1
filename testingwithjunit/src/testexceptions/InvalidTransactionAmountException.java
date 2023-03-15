package testexceptions;

public class InvalidTransactionAmountException extends RuntimeException {
	
	private static final long serialversionUID  =1;
	
	public  InvalidTransactionAmountException(String message)  {
		super(message);
		
	}

	

}
