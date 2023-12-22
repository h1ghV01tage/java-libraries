package com.example.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		//create a treemap
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		
		//populate the ma
		
		tm.put("Papa", 15.7);
		tm.put("Sierra", 18.33);
		tm.put("Qubec", 11.6);
		tm.put("November", 10.0);
		tm.put("Romeo", 4.5);
		tm.put("Oscar", 20.5);
		
		//get a set of entries
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		//display the elements
		for(Map.Entry<String, Double> entry : set) {
			
			System.out.print(entry.getKey() + ": ");
			System.out.println(entry.getValue());
			
			
		}
		
		
		System.out.println();
		
		
	}
	
}
