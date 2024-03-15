package com.LinkedList;


import java.util.*;

import com.LinkedList.basicLinkedList.Node;

public class lengthLInkedList {
	
	public static class Node {
		
		int data;
		 
		Node next;
		Node(int data) {
			 this.data = data;
		 }
		
		public static void display(Node head) {
			Node temp = head;
			// simple display
			while(temp != null) {
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
		}
		
		public static int length(Node a) {
			int count =0;
			
			while(a!= null) {
				count++;
				a = a.next;
			}
		return count;
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
		
		System.out.println(length(a));
		
	}
}
	}
