package com.example.stream;

import java.util.ArrayList;

//in this application, we create parallel stream of double and calculate the product of square root
public class StreamDemo3 {

	public static void main(String[] args) {
		
		//create a new list of double values
		ArrayList<Double> myList = new ArrayList<Double>();
		
		//populate the list
		myList.add(10.56);
		myList.add(11.54);
		myList.add(3.56);
		myList.add(27.56);
		myList.add(12.55);
		
		Double productSQR = myList.parallelStream().reduce(1.0,
										(a,b) -> a * Math.sqrt(b),
										(a,b) -> a * b
													 	);
		
		System.out.println("Product of square roots: " + productSQR);
		
	}
	
	
}
