package com.aurionpro.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class POCSetTypes {
	public static void main(String[] args) {
		
		System.out.println("HASHSET");
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Sarthak");
		hashSet.add("gangan");
		hashSet.add("thane");
		hashSet.add("thIs");
		hashSet.add("thane");
		hashSet.add("Aurionpro");
		hashSet.add("swabhav");
		
		System.out.println(hashSet);
		
		System.out.println("\n LINKEDHASHSET");
		
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("Sarthak");
		linkedHashSet.add("gangan");
		linkedHashSet.add("thane");
		linkedHashSet.add("thIs");
		linkedHashSet.add("thane");
		
		System.out.println(linkedHashSet);
		
		System.out.println("\n TREESET");
		
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Sarthak");
		treeSet.add("gangan");
		treeSet.add("thane");
		treeSet.add("thIs");
		treeSet.add("thane");
		
		System.out.println(treeSet);
		
		System.out.println("\nAfter retainAll");
		hashSet.retainAll(linkedHashSet);
		System.out.println(hashSet);
		hashSet.add("Rabale");
		hashSet.add("Aurionpro");
		hashSet.add("swabhav");
		hashSet.add("Java");
		hashSet.add("abc");
		
		System.out.println("\nAfter addall");
		
		linkedHashSet.addAll(hashSet);
		
		System.out.println(linkedHashSet);
		
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		
	}

}
