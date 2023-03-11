package oopsday3.atm.menu;



//import oopsday3.atm.menu.Account;
//import oopsday3.atm.menu.BankofAmerica2;
import java.util.Scanner;

import oopsday3.atm.exception.InsufficientFundException;

public class BankMenu 
{
	
	/*1.display account */
	BankofAmerica2 boa = new BankofAmerica2();
	public BankMenu() 
	{
	Account a1 = new Account(101, "john Doe", "savings", 500);
	Account a2 = new Account(102, "jone Doe", "savings", 700);
	Account a3 = new Account(103, "jason Doe", "salary", 850);
	Account a4 = new Account(104, "jane Doe", "salary", 250);
	Account a5 = new Account(105, "jonas Doe", "pension", 650);
	
	
	boa.addAccount(a1);
	boa.addAccount(a2);
	boa.addAccount(a3);
	boa.addAccount(a4);
	boa.addAccount(a5);
	}
public void menu() throws NegativeAmountException {
}
{
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	loop:do {
			System.out.println("Enter your choice 1...5");
			System.out.println("1:Display Account:");
			System.out.println("2.Deposit");
			System.out.println("3.withdraw");
			System.out.println("4.Balance");
			System.out.println("5.Exit");
			choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
				{  
					System.out.println("Enter the actno");
					int actno = scanner.nextInt();
					boa.displayAccount(actno);
					break;
				}
				case 2:
				{
					double balance = boa.deposit(200, 101);
					System.out.println(balance);
					break;
				}
				case 3:
				{ 
					double balance = 0;
					try {
						balance = boa.withdraw(200, 101);
					} catch (InsufficientFundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(balance);
					
				
					break;
				}
				case 4:
				{
				 int actno = scanner.nextInt();
				 System.out.println(boa.balance(actno));
					
					break;
				}
				case 5:
				{
					break loop;
				}
					
				}
		}while(choice != 5);
		{
			
		}
	
}	
		
}