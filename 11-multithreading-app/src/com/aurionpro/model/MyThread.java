package com.aurionpro.model;

public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
		start();
	}
	
	public void run(Thread thread) {
		for(int i = 5; i > 0; i--)
		{
			System.out.println(thread.currentThread().getName() + " : " + i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
