package com.example.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		
		//create an arraylist of doubles
		ArrayList<Double> values = new ArrayList<>();
		
		//add values to the array list
		values.add(1.0);
		values.add(2.0);
		values.add(3.0);
		values.add(4.0);
		values.add(5.0);
		
		//use the tryAdvance() to display contents of the values arr
		System.out.println("Contents of the values: ");
		
		Spliterator<Double> splitter = values.spliterator();
		
		//spliterator is packed with action :D :D
		while(splitter.tryAdvance((n)-> {System.out.println(n);}));
		
		//create a new arrayList that contains square roots
		ArrayList<Double> sqRoots = new ArrayList<Double>();
		
		splitter = values.spliterator();
		
		while(splitter.tryAdvance((n)-> {
			sqRoots.add(Math.sqrt(n));
		
		}));
		
		//System.out.println(sqRoots);
		
		//forEachRemaining method to display the newly created arrayList of squareroots
		splitter = sqRoots.spliterator();
		splitter.forEachRemaining((n)-> {
			
			System.out.println(n);
		});
		
		
		
	}
	
}
