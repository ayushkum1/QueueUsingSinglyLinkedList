package com.app.queue_singly_linked_list;

public class QueueSinglyLinkedList implements QueueOperationInterface {

	ListNode head;
	ListNode tail;
	
	public QueueSinglyLinkedList() {
		head = null;
	}
	
	public class ListNode{
		int data;
		ListNode next;
	}
	
	@Override
	public void push(int n) {
		
		ListNode newNode = new ListNode();
		newNode.data = n;
		newNode.next = null;
		
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}

	@Override
	public int pop() {
		
		int poppedNum = 0;
		
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			poppedNum = head.data;
			head = head.next;
		}
		
		return poppedNum;
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public void printList() {
		ListNode currentNode;
		 currentNode = head;
		 
		 while(currentNode!=null) {
			 System.out.println(currentNode.data);
			 currentNode = currentNode.next;
		 }
	}
	
}
