package com.example.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		
		//create and initalize a linkedlist
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(3);
		ll.add(5);
		ll.add(2);
		ll.add(7);
		
		//output the linkedlist to the console
		System.out.println(ll);
		
		//create a reversed order comparator
		Comparator<Integer> c = Collections.reverseOrder();
		
		//Sort list by using the comparator
		Collections.sort(ll, c);
		
		//Output the elments in the list sorted in reversed order
		System.out.println("List sorted in reverse");
		for(int i : ll) {
			
			System.out.println(i);
			
		}
		
		System.out.println("List shuffled");
		//shuffle the list
		Collections.shuffle(ll);
		//output the shuffled list
		for(int i : ll) {
			
			System.out.println(i);
		}
		
		//Print the maximum value in the list
		System.out.println("Maximum value "+ Collections.max(ll));
		System.out.println("Minimum value "+ Collections.min(ll));
		
		
		
		
	}
	
}
