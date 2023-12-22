package com.example.collections;

import java.util.LinkedHashSet;

//LinkedHashSet is a hs that maintains the order of elements in the order that they were inserted
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//create a linked hash set
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//add elements to this lhs
		lhs.add("A");
		lhs.add("E");
		lhs.add("I");
		lhs.add("O");
		lhs.add("U");
		
		//Output the lhs to the console
		System.out.println(lhs);
		
	}
	
}
