package com.app.queue_singly_linked_list;

import java.util.Arrays;
import java.util.Scanner;

	/*
	 * Q2.2 Define Queue as Abstract Data Type (ADT).
	 * Q2.5 Implement a class for Queue ADT (defined in Q2.2), that implements linear queue using array. 
	 * The class should accept the size of array during object creation (via Constructor).
	*/


public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter the size of your Queue");
			
			QueueOperationInterface qInterface = new QueueSinglyLinkedList();
			
			boolean exit = false;
			
			while(!exit) {
				
				System.out.println("1.  Push item");
				System.out.println("2.  Pop item");
				System.out.println("3.  Check if Queue is Empty");
				System.out.println("4.  Check if Queue is Full");
				System.out.println("5.  Print Queue");
				System.out.println("6.  Exit");
				System.out.println("Enter your choice: ");
				
				switch(sc.nextInt()) {
				
				case 1:
					System.out.println("Enter the element to be pushed");
					
//					qInterface.push(sc.nextInt());
					qInterface.push(10);
					qInterface.push(9);
					qInterface.push(8);
					qInterface.push(7);
					qInterface.push(6);
					qInterface.push(5);
					qInterface.push(4);
					
					break;
				
				case 2:
										
					System.out.println("The element popped is : " + qInterface.pop());
					
					break;
				
				case 3:
					
					System.out.println("Is the Queue empty? Answer: " + qInterface.isEmpty());
					
					break;
				
				case 4:
					
					System.out.println("Is the Queue full? Answer: " + qInterface.isFull());
					
					break;
				
				case 5:
					
					((QueueSinglyLinkedList)qInterface).printList();
					
					break;
				
				case 6:
					
					System.out.println("Bye!!");
					exit = true;
					System.exit(0);
					
					break;
				
				}
				
			}
			
		}
		
	}

}
