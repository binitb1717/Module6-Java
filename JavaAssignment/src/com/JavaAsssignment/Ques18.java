package com.JavaAsssignment;
/*
Assignment_question18
WAP to create one thread by extending Thread class in another
Class. 
*/

class AssQues18 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("First thread is ... "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First Thread Completed ...");
	}
	
	
	
}

public class Ques18{
	public static void main(String[] args) throws InterruptedException {
		
		Ques18 Q18 = new Ques18();
//		Q18.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread is ...."+i);
			Thread.sleep(2000);
			
		}
		System.out.println("main thread is completed ... ");
	}
}
