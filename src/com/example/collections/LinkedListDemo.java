package com.example.collections;

import java.util.LinkedList;

//Demonstrate Linked List
public class LinkedListDemo {

	public static void main(String[] args) {
		
		//create a linked list
		LinkedList<String> ll = new LinkedList<String>();
		
		//add elements to the linked list
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		
		//Add elements to the first and last position
		ll.addLast("Z");
		ll.addFirst("A");
		
		//add an element with the index
		ll.add(1, "A2");
		
		//output the contents of the new list
		System.out.println(ll);
		
		//remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		
		//output to the console
		System.out.println(ll);
		
		//remove the first and the last elements
		ll.removeFirst();
		ll.removeLast();
		
		//output after removing the first and last element
		System.out.println(ll);
		
		//Get and set a value
		String val = ll.get(2);
		ll.set(2, "Changed");
		
		//output the final list
		System.out.println(ll);
		
	}
	
}
