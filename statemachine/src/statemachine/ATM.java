package statemachine;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int atm_amount = 5000;
		int atm_100 = 20;
		int atm_50 = 40;
		int atm_10 = 100;
		int u=0;int s=0;int t=0;
		int attempt = 2;
		
		System.out.println("enter the amount :");
		Scanner sc  = new Scanner(System.in);
		int input = sc.nextInt();
	
			
				//System.out.println("enter the denomination:");
				//System.out.println("1.100Rs 2.50Rs 3.10Rs");
				while(attempt!=0) {
					if(input>atm_amount ) {
						System.out.println("insuffient balance in atm");
						System.out.println("you have "+attempt+" attempts");
						System.out.println("enter amount:");
						input=sc.nextInt();
						attempt=attempt-1;
		
						continue;
					}
					else if(input ==0  )
					{
						System.out.println("invalid entry");
						System.out.println("you have "+attempt+" attempts");
						System.out.println("enter amount:");
						input=sc.nextInt();
						attempt=attempt-1;
					}
					
					else
					{
					System.out.println("enter the number of 100rs");
					int p = sc.nextInt();
				     s = p*100;
				  //  atm_100 = atm_100 - s;
				     if(s==input) {
				    	 System.out.println("cash dispensed");
				    	 break;
				     }
				     else {
				    	  if(s<input) {
				  	    	System.out.println("enter the number of 50rs");
				  			int q = sc.nextInt();
				  			  t = q*50;
				  			 //atm_50 = atm_50 - t;
				  			  if(t+s==input) {
				  				  System.out.println("cash dispensed");
				  				  break;
				  				  }
				  			  else {
				  				if(t<input) {
					  				  System.out.println("enter the number of 10rs");
					  					int r = sc.nextInt();
					  					// atm_10 = atm_10 - r;
					  					
					  					  u = r*10;
					  					  if(u+s+t==input) {
					  						  System.out.println("cash dispensed");
					  						  break;
					  					  }
					  					  else
					  						  System.out.println("Invalid");
					  			  }
				  			  }
				  			  
				  	   }
				  	 
				     }
				     
					} 
					attempt=attempt-1;
				     System.out.println("you have "+attempt+" attempts");
				}
			
			  
			    
				
				// for(i=0;i<input;i++)
				//
				
				
				int sum = s+t+u;
				
				 if(sum == input)
				 {
					 atm_amount=atm_amount-sum;
					 System.out.println(" ");
				 }
				 else {
					 System.out.println(" ");
				 }
				
		
		
		
		
		
		
	
	}

}
