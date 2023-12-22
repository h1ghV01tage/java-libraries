package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//create a hash map
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		//insert elements into the map
		hm.put("India", 1.0);
		hm.put("Juliet", 2.0);
		hm.put("Kilo", 3.0);
		hm.put("Lima", 4.0);
		hm.put("Mike", 5.0);
		hm.put("November", 6.0);
		
		System.out.println(hm);
		
		//Get a set of the entries
		Set <Map.Entry<String, Double>> set = hm.entrySet();
		
		//display the set
		for(Map.Entry<String, Double> me : set) {
			
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			
		}
		
		System.out.println();
		
		//deposit 5.5 into Juliet's acc
		double balance = hm.get("Juliet");
		hm.put("Juliet", balance + 5.5);
		
		//display the new balance
		System.out.println("Juliet new balance " + hm.get("Juliet"));
		
	}
	
}
