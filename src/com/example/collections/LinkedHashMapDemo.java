package com.example.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//create a new linked hash map
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		//populate the newly created linkedhashmap
		lhm.put(5, "Uniform");
		lhm.put(1, "Tango");
		lhm.put(3, "Victor");
		lhm.put(2, "Whiskey");
		lhm.put(4, "X-Ray");
		
		//create a set from the map
		Set<Map.Entry<Integer, String>> set = lhm.entrySet();
		
		for(Map.Entry<Integer, String> it: set) {
			
			System.out.print(it.getKey() + ": ");
			System.out.println(it.getValue());
			
		}
		
		System.out.println();
		
		
	}
	
	
}
