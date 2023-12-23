package com.example.collections;

import java.util.TreeSet;

public class CompareDemo {

	public static void main(String[] args) {
		
		//create a new treeSet
		TreeSet<String> ts = new TreeSet<String>(new MyComp().reversed());
		
		//add elements to the treeset
		ts.add("Bravo");
		ts.add("Golf");
		ts.add("Alpha");
		ts.add("Papa");
		
		//display the output without comparing: displays in natural order
		System.out.println(ts);
		
		//display individual elements without comparing. it sorts in the natural order
		for(String e:ts) {
			
			System.out.println(e);
			
		}
		
		
		
		
		
		
	}
	
}
