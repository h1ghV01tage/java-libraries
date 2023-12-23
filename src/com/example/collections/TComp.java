package com.example.collections;

import java.util.Comparator;

//This class implements the comparator interface to get the superpowers of sorting
//it is modified to sort according to the last name field
public class TComp implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		
		//declare the 3 variables we are going to need
		int i, j,k;
		
		//get the index where the lastname starts
		i = o1.lastIndexOf(" ");
		j = o2.lastIndexOf(" ");
		
		
		//compare
		k = o1.substring(i).compareTo(o2.substring(j));
		
		//if last name is same, sort based on first name
		if(k == 0) {
			
			return o1.compareTo(o2);
			
		}
		
		//if last name isn't same, sort by lastname
		else
			
		{
			return k;
		}
		
	}
	
}
