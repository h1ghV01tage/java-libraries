package com.example.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

//using superpowers of stream: filter(), sorted(), min(), max(),forEach()
public class StreamDemo {

	public static void main(String[] args) {
		
		//create an araylist of integer values
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		//populate the list
		myList.add(7);
		myList.add(1);
		myList.add(2);
		myList.add(11);
		myList.add(4);
		myList.add(17);
		myList.add(187);
		
		//output the original list
		System.out.println("Original List: " + myList);
		
		//Obtain a Stream of the arraylist
		Stream<Integer> myStream = myList.stream();
		
		//obtain the min and the max value
		Optional<Integer> minVal = myStream.min(Integer::compare);
		
		//get the optional value if it is present and output to console
		System.out.print("The minimum value is : ");
		if(minVal.isPresent()) System.out.println(minVal.get());
		
		//create a new stream because previous was consumed by the terminal operation
		Stream<Integer> yourStream = myList.stream();
		//obtain the max value
		Optional<Integer> maxVal = yourStream.max(Integer::compare);
		
		//if the value exists in the stream, print this
		System.out.print("The maximum value is: ");
		if(maxVal.isPresent()) 
			System.out.println(maxVal.get());
		
		//sort the stream
		Stream<Integer> sortedStream = myList.stream().sorted();
		
		//display the sorted stream
		System.out.println("Sorted Stream");
		sortedStream.forEach((n)-> System.out.print(n + " "));
		System.out.println();
		
		//display the odd values only by using filter
		System.out.println("Odd numbers only");
		Stream<Integer> oddVal = myList.stream().filter((n)-> n % 2 == 1);
		oddVal.forEach((n)-> System.out.print(n + " "));
		System.out.println();
		
		//display the odd numbers that are greater than 5
		Stream<Integer> filteredOddVal=myList.stream()
				.filter((n) -> n % 2 == 1)
				.filter((n) -> n > 5);
		
		System.out.println("Odd numbers greater than 5");
		filteredOddVal.forEach((n) -> System.out.print(n + " "));
				
	}
	
}
