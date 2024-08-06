package com.aurionpro.map.test;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class POCMapTypes {
	public static void main(String[] args) {
		
		System.out.println("\nHashMap");
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("a", 100);
		hashMap.put(null, 200);
		hashMap.put("a", 600);
		hashMap.put("C", 500);
		hashMap.put("b", null);
		hashMap.put("E", null);
		hashMap.putIfAbsent("b", 111);
		
		System.out.println(hashMap);
		
		System.out.println("\nTreeMap");
		Map<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("a", 100);
		treeMap.put("a", 600);
		treeMap.put("C", 500);
		treeMap.put("b", null);
		treeMap.put("E", null);
		treeMap.putIfAbsent("b", 111);
		
		System.out.println(treeMap);
		
		System.out.println("Keys of the map are");
		System.out.println(treeMap.keySet());
		
		
	}

}
