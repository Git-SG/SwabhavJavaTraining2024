package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(String[] args) {
		BiConsumer<Integer, String> details = (Integer number, String name) -> System.out.println("The person's name is " + name + "\nThe person is " + number + " years old");
		
		details.accept(21, "Sarthak");
	}

}
