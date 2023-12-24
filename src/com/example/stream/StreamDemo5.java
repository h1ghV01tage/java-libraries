package com.example.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
	
	//main method
	public static void main(String[] args) {
		
		//create an arraylist that holds the object NamePhoneEmail
		ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();
		
		//populate
		myList.add(new NamePhoneEmail("Alpha", "3335554444", "onetwo@three.com"));
		myList.add(new NamePhoneEmail("Golf", "7778884444", "onetwo@three.com"));
		myList.add(new NamePhoneEmail("Papa", "1115554444", "onetwo@three.com"));
		myList.add(new NamePhoneEmail("Oscar", "3332224444", "onetwo@three.com"));
		
		//output the list as is by creating a stream
		System.out.println("Original values in the list: Containing name, phone and email");
		myList.stream().forEach((n)-> System.out.println(n.name + "\t" + n.phone + "\t" + n.email));
		System.out.println();
		System.out.println("Only Name and Phone Numbers");
		
		//map just the name and phone and not email
		myList.stream().map((n) -> new NamePhone(n.name, n.phone)).forEach((n) -> System.out.println(n.name + "\t" + n.phone));
		System.out.println();
		//create a new stream to perform filter and map
		myList.stream().filter((n)-> n.name.equals("Alpha"))
														.map((n) -> new NamePhone(n.name, n.phone))
														.forEach((n)-> System.out.println(n.name + "\t" + n.phone));
		

										
	
	}
	
}
