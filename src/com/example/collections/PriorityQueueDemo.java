package com.example.collections;

import java.util.PriorityQueue;

//to demonstrate the priority queue
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Task> tasks = new PriorityQueue<Task>((task1,task2) -> {
			
			return Integer.compare(task1.getPriority(), task2.getPriority());
			
		});
		
		tasks.add(new Task("Task1", 3));
		tasks.add(new Task("Task2", 1));
		tasks.add(new Task("Task3", 2));
		
		System.out.println(tasks);
		
		while(!tasks.isEmpty()) {
			
			Task task = tasks.poll();
			System.out.println(task);
			
		}
		
	}

}

//This class is a task class that we will prioritize using the priority queue
class Task {
	
	//define the fields for the task
	private String name; 
	private int priority;
	
	//define the constructor for the task
	Task(String name, int priority){
		
		this.name = name;
		this.priority = priority;
		
	}
	
	//method to get priority
	public int getPriority() {
		
		return priority;
		
	}
	
	//to String method
	public String toString() {
		
		return "["+ "Task name: " + name + " , " + "Priority " + priority + "]" ;
	}
	
}