package com.aurionpro.thread;

public class MyThread1 implements Runnable {
	
	private Thread thread;
	
	public MyThread1(String name) {
		
		thread = new Thread(this, name);
		thread.start();
		
	}

	@Override
	public void run() {
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

	public Thread getThread() {
		return thread;
	}
	
	

}
