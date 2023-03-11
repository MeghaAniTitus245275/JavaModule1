package oopsday2.atm;

public interface BankingIface
{
	
	public abstract double withdraw(double amount);
	public abstract double deposit(double amount);
	public abstract double balance(int actno);
	
}
