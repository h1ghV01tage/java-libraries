package com.example.stream;
import java.util.ArrayList;
import java.util.Optional;

//demonstrate the reduce method
public class StreamDemo2 {

	public static void main(String[] args) {
		
		//create an array list of integer values
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		//populate the list
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(6);
		myList.add(2);
		myList.add(4);
		
		//use the reduce method of stream to find the product of all the numbers in the list
		Optional<Integer> product = myList.stream().reduce((t, u) -> t * u);
		
		//output the result to the console
		if(product.isPresent()) System.out.println("Product is: " + product.get());
		
		//use the reduce method to calculate the product of even numbers in the list
		Optional<Integer> evenProd = myList.stream().reduce((a,b) -> {
			
			if(b % 2 == 0) return a * b;
			else return a;
					
		
		});
		
		//display the result
		System.out.print("Sum of even numbers: ");
		if(evenProd.isPresent()) System.out.println(evenProd.get());
		
		
	}
	
}
