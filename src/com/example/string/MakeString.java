package com.example.string;

//Construct one string from another
public class MakeString {

	public static void main(String[] args) {
		
		//Define a char array with elements on it
		char [] c = {'a', 'b', 'c', 'd'};
		
		//create a new String from the char arr
		String s1 = new String(c);
		//create a new string from the existing string that we created
		String s2 = new String(s1);
		
		//print both newly created strings to the console
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
	}
	
}
