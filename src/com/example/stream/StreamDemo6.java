package com.example.stream;

import java.util.ArrayList;

public class StreamDemo6 {

	public static void main(String[] args) {
		
		//create a list of double values
		ArrayList<Double> myList = new ArrayList<Double>();
		
		//populate the list
		myList.add(10.25);
		myList.add(15.24);
		myList.add(17.85);
		myList.add(157.20);
		
		//Generate a stream and output the original values
		myList.stream().forEach((n)-> System.out.print(n + "\t"));
		System.out.println();
		
		//Map the ceiling of the elements to an intStream and print the result
		System.out.println("The ceiling of values in the list");
		myList.stream().mapToInt((n)-> (int)Math.ceil(n)).forEach((n)-> System.out.print(n + "\t"));
		
		
		
		
		
		
		
		
		
	}
	
}
