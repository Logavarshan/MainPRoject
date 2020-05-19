package com.niit.practise;

class A extends Thread
{
	public void run()
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println("In A");
			try {Thread.sleep(500);} catch(Exception e) {
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println("In B class");
			try {Thread.sleep(501);} catch(Exception e) {
			}
		}
	}
		
	}


public class ThreadClass {
	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		a.start();
		b.start();

}
	
}
