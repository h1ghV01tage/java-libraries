package com.example.collections;

import java.util.HashSet;

//Demonstrate Hashset 
//does not sort the elements
public class HashSetDemo {

	public static void main(String[] args) {
		
		//create a hash set
		HashSet<String> hs = new HashSet<String>();
		
		//Add elements to the hash set
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");
		
		//output to the console
		System.out.println(hs);
		
		
	}
	

	
}
