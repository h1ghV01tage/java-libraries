package com.example.collections;

import java.util.LinkedList;

public class Address {

	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String name, String street, String city, String state, String code){
		
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.code = code;
		
		
	}
	
	public String toString() {

		return name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;

	}
	
	public static void main(String[] args) {
		
		//Maillist ml = new Maillist();
		
		
	}
	
	
}

class Maillist{
	
	
	public static void main(String[] args) {
		
		//create a new linkedlist
		LinkedList<Address> mailingList = new LinkedList<Address>();
		
		//add addresses to the linkedlist
		mailingList.add(new Address("Delta", "123 four Street", "Austin", "Texas", "11001"));
		mailingList.add(new Address("Echo", "456 seven Street", "Dallas", "Texas", "111001"));
		mailingList.add(new Address("Foxtrot", "789 ten Street", "Houston", "Texas", "1110001"));
		mailingList.add(new Address("Golf", "1011 twelve Street", "Irving", "Texas", "110101"));
		mailingList.add(new Address("Hotel", "1314 fifteen Street", "Plano", "Texas", "110101"));
		
		//display the list
		for(Address addy: mailingList) {
			
			System.out.println(addy);
			System.out.println();
		}
		
		
		
	}
	
	
}

