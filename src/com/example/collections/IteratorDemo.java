package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//demonstrate iterators
public class IteratorDemo {

	public static void main(String[] args) {
		
		//create an arraylist
		ArrayList<String> al = new ArrayList<String>();
		
		//add elements to the arraylist
		al.add("C");
		al.add("D");
		al.add("E");
		
		//output the arraylist
		System.out.println(al);
		
		//use the iterator to display contents of al
		System.out.println("Original contents of al: ");
		Iterator<String> iter = al.iterator();
		
		//loop through the elements
		//until there exists an element next to an element
		while(iter.hasNext()) {
			
			//assign the value to the element variable
			String element = iter.next();
			
			//output to the console the next element
			System.out.println(element + " ");
			
		}
		
		
		
		//print an empty line
		System.out.println();
		
		//modify objects while iterating
		ListIterator<String> litr = al.listIterator();
		
		while(litr.hasNext()) {
			
			String element = litr.next();
			litr.set(element + "+");
			
		}
		
		//modified contents of al
		System.out.println("Modified contents of al");
		
		//list contents of al in an old fashioned way
		for(String s: al) {
			
			System.out.println(s);
			
		}
		
		//display the list backwards
		System.out.println("Modified list backwards");
		while(litr.hasPrevious()) {
			
			String element = litr.previous();
			System.out.println(element + " ");
			
		}
		System.out.println();
		
		
		
	}
	
}
