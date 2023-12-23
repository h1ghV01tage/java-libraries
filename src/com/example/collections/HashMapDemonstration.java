package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemonstration {

	public static void main(String[] args) {
		
		//create a HashMap
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		//add elements to the map
		hMap.put(1, "Alpha");
		hMap.put(2, "Charlie");
		hMap.put(5, "Bravo");
		
		//Create a new set of elements
		Set<Map.Entry<Integer, String>> set = hMap.entrySet();
		
		//iterate over the set and print
		for(Map.Entry<Integer, String> entry : set) {
			
			//get the key and the value
			System.out.print(entry.getKey() + ": ");
			System.out.println(entry.getValue());
			
		}
		
		
	}
	
	
	
}
