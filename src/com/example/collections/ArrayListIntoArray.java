package com.example.collections;

import java.util.ArrayList;

//In this example, we convert an arraylist into an array
public class ArrayListIntoArray {

	public static void main(String[] args) {
		
		//create an arrayList
		//arraylist can't store primitive types only references
		ArrayList<Integer> al = new ArrayList<>();
		
		//add elements to the arr list
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		//output the contents of the arraylist
		System.out.println(al);
		
		//Create a new array with the size same as the arraylist we created
		Integer [] ia = new Integer[al.size()];
		
		//conversion of arraylist into this new array
		ia = al.toArray(ia);
				
		//initialize an integer variable to hold the sum
		int sum = 0;
		
		//sum the array
		//autoboxing: int in integer arr
		for(int s:ia) {
			
			sum += s;
	
		}
		
		//display the sum to console 
		System.out.println(sum);
		
		
	}
	
}
