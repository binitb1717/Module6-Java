package com.JavaAsssignment;

// WAP to demonstrate multiple catch block..
public class Ques16 {

	public static void main(String[] args) {
		
	
	int a = 100;
	
	String s = "Null";
	
	int b[]= new int[4];
	
	System.out.println("Program Initialised");
	
	
	try 
	{
		System.out.println(a/0);	
		System.out.println(s.length());
		b[5]=50;
	} 
	catch (ArithmeticException e)
	{
		System.out.println("Arithmetic Exception");	
	}
	catch (NullPointerException f) 
	{
		System.out.println("Null pointer Exception");
	}
	catch (ArrayIndexOutOfBoundsException g) 
	{
		System.out.println("ArrayIndexOutOfBound");
	}
	
	
	
	
	System.out.println("Program Exited");
}
}
