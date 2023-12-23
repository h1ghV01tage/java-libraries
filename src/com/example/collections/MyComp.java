package com.example.collections;

import java.util.Comparator;

//This will define the comparing order: in this case that is descending
public class MyComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
