package com.aurionpro.test;

import com.aurionpro.thread.MyThread1;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1("thread1");
		MyThread1 myThread2 = new MyThread1("thread2");
		MyThread1 myThread3 = new MyThread1("thread3");
		
		myThread1.getThread().setPriority(Thread.MAX_PRIORITY);
		myThread2.getThread().setPriority(Thread.NORM_PRIORITY);
		myThread3.getThread().setPriority(Thread.MIN_PRIORITY);

		
		System.out.println(myThread1.getThread().isAlive());
		System.out.println(myThread2.getThread().isAlive());
		System.out.println(myThread3.getThread().isAlive());

				
		for(int i = 5; i > 0; i--)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			myThread1.getThread().join();
			myThread2.getThread().join();
			myThread3.getThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(myThread1.getThread().isAlive());
		System.out.println(myThread2.getThread().isAlive());
		System.out.println(myThread3.getThread().isAlive());
	
	}

}
