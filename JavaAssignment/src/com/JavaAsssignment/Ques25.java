package com.JavaAsssignment;

import java.security.PublicKey;

/*W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
has two subclasses each having a method with the same name
'message' that prints "This is first subclass" and "This is second
subclass" respectively.
Call the methods 'message' by creating an object for each subclass.*/



abstract class parent
{
	abstract public void message(); 
}





class subclass1 extends parent{
	
	public void message() {
		System.out.println("This is First subclass: ");
	}
}




class subclass2 extends parent{
	
	public void message() {
		System.out.println("This is Second subclass: ");
	}	
}




public class Ques25 {
public static void main(String[] args) {
	
subclass1 run = new subclass1();
run.message();

subclass2 run2 = new subclass2();
run2.message();




	
	
}
}
