package com.example.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		
		//create a new list of double values
		ArrayList<Double> ad = new ArrayList<Double>();
		
		//populate
		ad.add(10.0);
		ad.add(12.00);
		ad.add(18.00);
		ad.add(3.78);
		ad.add(1.11);
		ad.add(345.24);
		ad.add(1287.012);
		
		//map the square root of the elements in the list to a stream
		Stream<Double> Sqrt = ad.stream().map((n) -> Math.sqrt(n));
		
		//calc the product of the stream with reduce method
		Double product = Sqrt.reduce(1.0, (a,b)-> a * b);
		
		//output the value to the console
		System.out.println(product);
		
	}
	
}
