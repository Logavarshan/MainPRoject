package com.niit.practise;

class A implements Runnable
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
class B implements Runnable
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
public class ThreadThread {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
		
	}

}
