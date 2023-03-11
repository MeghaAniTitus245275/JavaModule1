package oopsday3.atm.exception;

public class InsufficientFundException extends Exception {
	
	public InsufficientFundException() {
		
	}
public InsufficientFundException(String msg) {
		super(msg);
	}
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return super.getMessage();
}



}
