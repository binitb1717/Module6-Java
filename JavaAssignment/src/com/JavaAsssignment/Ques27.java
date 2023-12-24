package com.JavaAsssignment;

import java.util.Scanner;

/*W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than
account balance then program will show custom exception otherwise amount will deduct from
account balance.
Account balance is:2000
Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs.
To perform this transaction.*/

public class Ques27 {
	
	public class Atm {
		public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);	
		System.out.println("Please enter the amount to be withdrawn");	
		int amount=sc.nextInt();
		int b=amount-2000;

		if (amount<=2000) {
			System.out.println("Pleas wait while your transaction is being processed");
		}else {
			System.out.println("Sorry insufficient funds, you need more "+b+" to perform this transaction");
		}	
			
			
		}

	
	
	
}
}
