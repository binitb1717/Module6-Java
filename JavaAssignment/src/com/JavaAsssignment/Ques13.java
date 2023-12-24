package com.JavaAsssignment;

import java.util.Scanner;

/* Assignment_question13
WAP to compare two String.
*/

public class Ques13 {
public static void main(String[] args) {
	
	String N1 ;
	String N2 ;
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Value of String1 is: ");
	N1 = sc.nextLine();
	
	System.out.println(" Value of String2 is: ");
	N2 = sc.nextLine();
	
	
	if (N1.equals(N2)) {
		System.out.println(" String is Equal ");
	}else {
		System.out.println(" String is not Equal ");
	}

}
}
