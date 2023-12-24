package com.JavaAsssignment;

import java.util.Scanner;

public class Ques4 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter a value..");
	a=sc.nextInt();
	int n=1;

 for (int i = 2; i<a ; i++) {
	if(a%i==0) {
		n=0;
	}
		
}if (n==0) {
	System.out.println(+a+" is not a Prime Number ");
}else {
	System.out.println(+a+" is a Prime Number ");
}
}
}
