package com.aurionpro.test;

import com.aurionpro.model.Demo;

public class DemoTest {
	
	static {
		System.out.println("hello1");
	}
	
	public static void main(String[] args) {
		Demo demo1 = new Demo();
		
		System.out.println(demo1.toString());
		demo1.increment();
		System.out.println(demo1.toString() + "\n");

		Demo demo2 = new Demo();
		System.out.println(demo2.toString());
		demo2.increment();
		System.out.println(demo2.toString() + "\n");
		
		Demo demo3 = new Demo();
		System.out.println(demo3.toString());
		demo3.increment();
		System.out.println(demo3.toString() + "\n");
	}
	
	static {
		System.out.println("hello2");
	}

}
