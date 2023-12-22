package com.example.collections;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueDemonstration {

	public static void main(String[] args) {
		
		PriorityQueue<Tasking> pq = new PriorityQueue<>((task1,task2) -> {
			
			
			return Integer.compare(task1.getPriority(), task2.getPriority());
			
		});
		
		pq.add(new Tasking("Job C", 3));
		pq.add(new Tasking("Job A", 1));
		pq.add(new Tasking("Job B", 2));
		
		System.out.println(pq);
		
		//iterate using an iterator
		Iterator<Tasking> it = pq.iterator();
		
		while(it.hasNext()) {
			
			Tasking tx = it.next();
			System.out.println(tx);
			
		}
		
		//iterate until the list is not empty
		while(!pq.isEmpty()) {
			
			//get the head element
			Tasking tk = pq.poll();
			//output to the console
			System.out.println(tk);
		}
		
		
	}
	
	
}

class Tasking{
	
	private String name;
	private int priority;
	
	Tasking(String name, int priority){
		
		this.name = name;
		this.priority = priority;
	}
	
	public int getPriority() {
		
		return this.priority;
	}

	@Override
	public String toString() {
		return "Tasking [name=" + name + ", priority=" + priority + "]";
	}
	
	
}
