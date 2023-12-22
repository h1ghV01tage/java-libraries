package com.example.string;

//In this program, we construct string from the subset of a char arr
public class SubStringCons {

	public static void main(String[] args) {
		
		//create a byte arr with 6 elements
		byte [] asc = {65,66,67,68,69,70};
		
		//convert the byte into String
		String s1 = new String(asc);
		
		//output the created String into the console
		System.out.println(s1);
		
		//create a new string from s1
		String s2 = new String(asc, 2, 3);
		
		//output the newly created string into the console
		System.out.println(s2);
		
		
	}
	
}
