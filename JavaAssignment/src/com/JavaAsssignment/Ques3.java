package com.JavaAsssignment;

import java.util.Scanner;

public class Ques3 {
public static void main(String[] args) {
	
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int m=sc.nextInt();
		int n=1;

		for (int i = 1; i<=m; i++) {
		n=n*i;
		System.out.print(n+", ");		
		}

}
}