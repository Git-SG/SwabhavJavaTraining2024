package com.aurionpro.model;

public class Demo {
	
	private static int a = 1;
	private int b = 1;
	private int c = 1;
	
	public void increment() {
		a++;
		b++;
		c++;
		
		{
			System.out.println("After increment");
		}
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
