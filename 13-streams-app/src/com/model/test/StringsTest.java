package com.model.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringsTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
		
		List<String> firstThree = names.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(firstThree);
		
		List<String> hasA = names.stream().filter((name -> name.contains("a"))).sorted().limit(3).collect(Collectors.toList());
		System.out.println(hasA);
		
		List<String> firstThree = names.stream().map(name -> name).collect(Collectors.toList());
		System.out.println(firstThree);
	}

}
