package com.example.collections;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//Allocate and initialize an array
		
		int [] array = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			
			array[i] = -3 * i;
		}
		
		//Display, sort, sort and display
		System.out.println("Original contents of the array");
		display(array);
		Arrays.sort(array);
		System.out.println("Sorted array");
		display(array);
		
		//fill and display the array
		Arrays.fill(array, 1,2,3);
		System.out.println("After filling");
		display(array);
		
		//perform sorting again
		Arrays.sort(array);
		System.out.println("After sorting again");
		display(array);
		
		//binary search for -9 and display
		System.out.println("Index of -9 is");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
		
		
	}
	
	//This method displays the contents of the array
	public static void display(int [] array) {
		
		for(int i: array) {
			
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		
	}
	
	
}
