package com.example.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {

	public static void main(String[] args) {
		
		//Create an arrayList of names, phone and email addresses
		ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();
		
		//populate
		myList.add(new NamePhoneEmail("John Doe", "1112223333", "one_two@three.com"));
		myList.add(new NamePhoneEmail("Foo Bar", "9992223333", "one_four@three.com"));
		myList.add(new NamePhoneEmail("Jack Smith", "1116663333", "two_two@three.com"));
		myList.add(new NamePhoneEmail("Harley Davison", "1112227777", "eight_two@three.com"));
		
		//map just the name and phone numbers to a new stream
		List<NamePhone> npList = myList.stream().map((n)-> new NamePhone(n.name, n.phone))
														.collect(Collectors.toList());
		
		//name and phone in a list display
		System.out.println("Name and Phone in a list");
		
		for(NamePhone e: npList) {
			
			System.out.println(e.name + "\t" + e.phone);
			
		}
		
		//because we used the terminal operation, we are going to have to create a new stream
		Set<NamePhone> set = myList.stream().map((n)-> new NamePhone(n.name, n.phone))
											.collect(Collectors.toSet());
		System.out.println();
		
		//output the contents of the set to console
		for(NamePhone e: set) {
			
			System.out.println(e.name + "\t" + e.phone);
			
		}
		
		//create a new stream
		LinkedList<NamePhone> npLL = myList.stream().map((n)-> new NamePhone(n.name, n.phone))
						.collect(()-> new LinkedList<>(),
								(list,element)-> list.add(element) ,
								(listA,listB)-> listA.addAll(listB));
		
		System.out.println();
		//iterate through the items in the linkedlist and return each item
		for(NamePhone e: npLL) {
			
			System.out.println(e.name + "\t" + e.phone);
			
		}
		
		//create another stream
		HashSet<NamePhone> hs = myList.stream().map((n)-> new NamePhone(n.name, n.phone))
												.collect(HashSet::new, HashSet::add, HashSet::addAll);
		
		System.out.println();
		//iterate over the hashset and display its contents
		
		for(NamePhone e : hs) {
			
			System.out.println(e.name + "\t" + e.phone);
			
		}
		
		
		
		
		
		
	}
	
}
