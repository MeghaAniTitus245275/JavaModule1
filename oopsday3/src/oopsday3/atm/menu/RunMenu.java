package oopsday3.atm.menu;

public class RunMenu {
	public static void main(String args[]) throws NegativeAmountException
	{
		BankMenu bank= new BankMenu();
		bank.menu();
	}

}
