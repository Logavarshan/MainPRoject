package com.niit.practise;


public class ThreadLambdha {

	public static void main(String[] args) {
		
			
		
		Thread t1 = new Thread(() ->
		{
			for (int i=0;i<=5;i++)
			{
				//System.out.println(Thread.currentThread().getPriority()); this is also the way of getting the priority and name of the current thread
			System.out.println("In A");
			try {Thread.sleep(600);} catch(Exception e) {}
			}
		}
			,"This is the name of t1 thread");		//This is the name of t1 thread
		t1.setPriority(Thread.MAX_PRIORITY);			//setting priority for t1 thread
		//t1.setName("This is final");		we can also set name of the thread like this
		Thread t2 = new Thread(() ->
		{
			for (int i=0;i<=5;i++)
			{
			System.out.println("In Bat");
			try {Thread.sleep(601);} catch(Exception e) {}
			}},"This is the name of t2 thread");	//This is the name of t2 thread
		t2.setPriority(5);				//setting priority for t2 thread
		System.out.println(t1.getName());		//getting the name of t1 and t2 thread
		System.out.println(t1.getPriority());	//getting the priority for t1 and t2 thread
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		System.out.println(t1.isAlive()); 		//This will give you true bcoz it is inside the method and also try catch method is also required to perform this task
		
		try {
			t1.join();
		}
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());		//This will give you false bcoz by the time the proceedure comes at this point the functioning of t1 thread is finished and it is dead
					
		System.out.println("Bye");
	}


}
