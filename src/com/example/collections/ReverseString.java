package com.example.collections;

import java.util.ArrayList;

import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		
		ArrayList<String> ls = new ArrayList<String>();
		
		ls.add("Alpha");
		ls.add("Charlie");
		ls.add("Bravo");
		
		System.out.println(ls);
		
		ListIterator<String> li = ls.listIterator();
		
		while(li.hasPrevious()) {
			
			String element = li.previous();
			System.out.println(element + " ");
		}
		
	}
	
}
