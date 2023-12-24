package com.JavaAsssignment;

import java.util.Scanner;

public class Ques1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	
	System.out.println(("Enter value of a: "));
	a=sc.nextInt();
	
	System.out.println("Enter Value of b: ");
	b=sc.nextInt();
	
	System.out.println("Enter value of c: ");
	c=sc.nextInt();
	
	if (a>b) {
		if (a>c) {
			System.out.println("a is Greatest "+a);
			}else { System.out.println(" c is Greatest "+"I.E. "+c);
			}
	}else {
		if (b>c) {
			System.out.println("b is Greatest "+b);
		}else { System.out.println("c is Greatest "+"I.E. "+c);

	}
	}
}
}

