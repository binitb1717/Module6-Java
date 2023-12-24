package com.JavaAsssignment;

public class Ques7 {
	public static void main(String[] args) {
		
//----------------------  PATTERN  QUESTIONS --------------------------------		

//Question 1)
		int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
				System.out.println();
		}
		
//Question 2)
		int n1=5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
				System.out.println();
		}

//Question 3)

		int n3=1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j%2);
			}
				System.out.println();
		}
		
//Question 4)
		
		for (int i = 1; i <= 4; i++) {
			
			for (int k = i; k <= 3; k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < 2*i; j++) {
				System.out.print(i+" ");
			}
				System.out.println();
		}
	

//Question 5)
		
		for (int i = 1; i <= 3 ; i++)
		{
			for (int k = i; k <=3; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j < 2*i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 2; i >= 1; i--)
		{
			for (int k = 3; k >= i; k--)
			{
				System.out.print(" ");
			}	
				for (int j = 2*i; j > 1; j--)
				{
					System.out.print("*");
				}
			System.out.println();
		}
}
	
}

