package com.example.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	//main method
	public static void main(String[] args) {
		
		//create a treemap
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
		
		//add items to the tm
		tm.put("Alpha Golf", 10.54);
		tm.put("Papa Bravo", 55.51);
		tm.put("November Delta", 111.57);
		tm.put("Echo Foxtrot", 54.54);
		tm.put("Lima Foxtrot", 11.55);
		tm.put("Ocean Delta", 44.56);
		
		//display to the console
		//create a set from the map
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		//iterate and display each element
		for(Map.Entry<String, Double> element: set) {
			
			System.out.print(element.getKey() + ": ");
			System.out.println(element.getValue());
			
		}
		
		
	}
	
}
