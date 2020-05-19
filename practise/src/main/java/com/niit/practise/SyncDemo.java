package com.niit.practise;

class Hello
{
	int a;
	public synchronized void display()		//using syncronized keyword will allow one thread to complete its process then the other thread will take over
	{
		++a;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception{
		
		Hello q = new Hello();
		Thread t1 = new Thread(new Runnable ()
				{
					public void run() {
						for (int i=1;i<=1000;i++)
						{
							q.display();
						}	
					}
				}
				);
		Thread t2 = new Thread(new Runnable ()
		{
			public void run() {
				for (int i=1;i<=1000;i++)
				{
					q.display();
				}	
			}
		}
		);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println(q.a);
		
	}
}