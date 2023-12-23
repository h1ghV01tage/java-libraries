package com.example.collections;

import java.util.TreeSet;

public class CompareLamda{

	public static void main(String[] args) {
		
		//create a new treeset, but this time pass a comparator as a lambda expr
		TreeSet<String> ts = new TreeSet<String>((a,b)-> b.compareTo(a));
		
		//Add elements to the treeset
		ts.add("Bravo");
		ts.add("Charlie");
		ts.add("Golf");
		ts.add("Papa");
		ts.add("Alpha");
		
		//output each elements of the ts to the console
		for(String s: ts) {
			
			System.out.println(s);
			
		}
		
		
	}
	
}
