package com.aurionpro.test;

public class ThreadTest {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		
		thread.setName("Thread1");
		System.out.println(thread);
		
		for(int i = 5; i > 0; i--)
		{
			System.out.println(thread.currentThread().getName() + " : " + i );
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
