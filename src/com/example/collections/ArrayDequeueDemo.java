package com.example.collections;

import java.util.ArrayDeque;

//Demonstrate array dequeue
public class ArrayDequeueDemo {

	public static void main(String[] args) {
		
		//create an arraydequeue
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		//use an arraydequeue like a stack
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		//Output the elements in the dequeue
		System.out.println(adq);
		
		//Display a friendly message
		System.out.println("Popping the stack");
		
		//
		while(adq.peek()!= null) {
			
			System.out.println(adq.pop() + " ");
			
			System.out.println();
			
		}
		
		
	}
	
}
