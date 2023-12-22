package com.example.collections;

import java.util.ArrayList;

//we demonstrate arraylist by first creating an empty arraylist and performing add and remove operations,
//we use different constructors, add and remove at the index as well as the objects directly
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//create an array list
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Initial size " + al.size());
		
		//Add elements to the arr list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		//print the size of arr list after adding elements
		System.out.println("size after additions " + al.size());
		
		//display the arr list
		System.out.println(al);
		
		//remove elements from the array list
		al.remove("F");
		al.remove(2);
		
		//Print the size of the arr after deletions
		System.out.println("The new size after deletions " + al.size());
		
		//Print all the contents of the new arr
		System.out.println(al);
		
		
	}
	
	
}
