package com.LinkedList;

import java.util.*;  

public class displayLinkedList {
	
	public static void display(Node head) {
		Node temp = head;
		// simple display
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	public static void displayRec(Node head) {
		Node temp = head;
		if(head == null) {
			return;
		}
		System.out.print(head.data+" ");
		displayRec(head.next);
		
	}
	public static void displayRev(Node head) {
		Node temp = head;
		if(head == null) {
			return;
		}
		displayRec(head.next);
		System.out.print(head.data+" ");	
		
	}
	
	public static  class Node {
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String args[]) {
		 
		 Node a = new Node(1);
		 Node b = new Node(2);
		 Node c = new Node(3);
		 Node d = new Node(4);
		 Node e = new Node(5);
		 
		 a.next = b;
		 b.next = c;
		 c.next = d;
		 d.next  = e;
		 
		 Node  temp=a;
//		 for(int i=1;i<=5;i++) {
//			 System.out.print(temp.data +" ");
//			 temp = temp.next;
//		 }
		 
//		 while(temp != null) {
//			 System.out.print(temp.data +" ");
//			 temp = temp.next;
//		 }
		 
		 displayRev(a);
	}
}
