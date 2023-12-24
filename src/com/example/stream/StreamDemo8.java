package com.example.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

//To demonstrate the use of iterator with stream
public class StreamDemo8 {

	public static void main(String[] args) {
		
		
		//create a list of strings
		ArrayList<String> als = new ArrayList<>();
		
		//populate
		als.add("Alpha");
		als.add("Beta");
		als.add("Gamma");
		als.add("Delta");
		als.add("Omega");
		als.add("Phi");
		
		//obtain a stream to the arraylist
		Stream<String> myStream = als.stream();
		
		//obtain an iterator to iterate through the stream
		Iterator<String> iter = myStream.iterator();
		
		//iterate through the stream
		while(iter.hasNext()) {
			
			
			System.out.println(iter.next());
			
		}
		
		//obtain a new stream because the terminal operation used the stream
		Stream<String> yourStream = als.stream();
		Spliterator<String> splitter = als.spliterator();
		
		System.out.println();
		//use the tryadvance method of spliterator to display the contents to the console
		while(splitter.tryAdvance((n)-> System.out.println(n)));
		
		System.out.println();
		splitter.forEachRemaining((n)-> System.out.println(n));
		
	}
	
	
}
