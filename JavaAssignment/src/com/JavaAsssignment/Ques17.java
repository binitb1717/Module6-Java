package com.JavaAsssignment;


/*
Assignment_question17
WAP to create one thread by implementing Runnable interface in
Class.
*/



public class Ques17 implements Runnable {

	
	

		@Override
		public void run() 
		{
			// TODO Auto-generated method stub
			for (int i = 1; i <= 5; i++)
			{
				System.out.println("First thread is ...."+i);
				try 
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("First thread completed ....");
		}
		
}


	
	

