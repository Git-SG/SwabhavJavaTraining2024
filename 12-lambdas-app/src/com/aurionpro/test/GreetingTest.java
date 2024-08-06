package com.aurionpro.test;
import com.aurionpro.model.IGreeting;

public class GreetingTest {
	
	public static void main(String[] args) {
		IGreeting greeting = name -> System.out.println("Hello " + name);
		
		greeting.greet("Sarthak");

	}
	

}
