package com.aurionpro.list.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> objects = new ArrayList();
//		List<Integer> integrs =Arrays.asList();
		
		System.out.println(objects.size());
		
		objects.add("Sarthak");
		objects.add("Gangan");
//		objects.add(21);
//		objects.add(true);
		
		System.out.println(objects);
		
		System.out.println(objects.get(1));
//		List<String> objects2 = new objects.clone();
		objects.clear();
		System.out.println(objects.isEmpty());
	}
}
