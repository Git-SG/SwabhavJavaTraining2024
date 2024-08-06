package com.model.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(25, 30, 15, 45, 35, 40);
				
		numbers.stream()
			   .forEach((number -> System.out.println(number)));
		
		numbers.stream()
				.filter(number -> (number%2!=0))
				.forEach((number -> System.out.println(number)));
		
		
		List<Integer> filteredNumbers = numbers.stream()
			.filter(number -> (number%2!=0))
			.filter(number -> (number>35)).collect(Collectors.toList());
		
		System.out.print(filteredNumbers);
		
		List<Integer> squares = numbers.stream()
				.map(number -> number*number)
				.collect(Collectors.toList());
		
		System.out.println(squares);
		
		int sum = numbers.stream().reduce(0, (number1,number2) -> number1 + number2);
		System.out.println("Sum is :" + sum);
		
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sortedListDesc = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(sortedListDesc);
		
		Optional<Integer> maxNumber = numbers.stream().max((number1,number2)->number1-number2);
		
		if(maxNumber.isPresent())
			System.out.println(maxNumber.get());
		
		Optional<Integer> minNumber = numbers.stream().min((number1,number2)->number1-number2);
		
		if(maxNumber.isPresent())
			System.out.println(minNumber.get()); 
	}

}
