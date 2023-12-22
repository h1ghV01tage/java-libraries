package com.example.collections;

import java.util.TreeSet;

//Demonstrate treeset
//Treeset arranges the elements in ascending order
//It also makes retrieval operation fast

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//create a treeset
		TreeSet<String> ts = new TreeSet<String>();
	
		//insert elements into this treeset
		ts.add("Alpha");
		ts.add("Charlie");
		ts.add("Golf");
		ts.add("Papa");
		ts.add("Bravo");
		
		//display the contents of this set
		System.out.println(ts);
		
		//retrieve elements in a range(inclusive,exclusive)
		System.out.println(ts.subSet("Charlie", "Papa"));
		
		//retrieve elements in a range(inclusive,inclusive)
		System.out.println(ts.subSet("Charlie", true, "Papa", true));
		
		
	}
	
}
