package com.aurionpro.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntryTest {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry: entries)
			System.out.println(entry.getKey() + "-" + entry.getValue());
		
		

	}

}
