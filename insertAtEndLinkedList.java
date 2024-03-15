package com.LinkedList;


import java.util.*;

public class insertAtEndLinkedList {
	
	public static class Node {
		
		int data;
		
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static class linkedlist {  
		static Node head = null;
		
		Node tail = null;
		
		int size = 0;
		
		void inserAtEnd(int val) {
			Node temp =  new Node(val);
			
			if(head == null) {
				head = temp;
				tail = temp;
			} else {
			 tail.next = temp;
			 tail = temp;
		}
			size++;
			
//			 tail = temp; reduce redundnecy
	}
	  	
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data +" ");
				temp = temp.next;
		}
			System.out.println();
   	}
		
		public static void insertEnd(Node head, int val) {
			Node temp = new Node(val);
			
			Node t = head;
			
			
			while(t.next != null) {
				t =  t.next;
				
			}
			
			t.next = temp;
			
		}
		
		int getAt(int index) {
			if(index<0 || index> size) {
				System.out.println("Wrong index");
				return -1;
			}
			
			Node temp  = head;
			
			for(int i=1;i<=index;i++) {
				temp = temp.next;
			}
			
			return temp.data;
		}
		
//		static int size() {
//			Node temp  = head;
//			int count  =0;
//			while(temp != null) {
//			
//				count ++;
//				temp = temp.next;
//				
//			}
//			return count;
//		}
		
		void insertAtindex(int index,int val) {
			Node t = new Node(val);
			
			Node temp = head;
			
			
			for(int i=1;i<=index-1;i++) {
				temp = temp.next;
			}
			  t.next = temp.next;
			  temp.next  = t;
			size++;
		}
		
		void deleteAt(int index) {
				
			if(index == 0) {
				head = head.next;  
				size--;
				return;
			}
			Node temp = head;
			
			for(int i=1;i<=index-1;i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			tail = temp; 
			size--;
			
 		}
		
		
	
		void insertAtHead(int val) {
			Node temp = new Node(val);
			
             if(head == null) {// empty list
            	 head= temp ;
            	 tail = temp;
            	 // insertAtEnd(val)-- another method
            	 
             } else {	 
    		temp.next = head;
			head = temp;
			size++;
		}
	}		
}
	
	
	public static void main(String args[]) {
		linkedlist ll = new linkedlist();
		

		ll.inserAtEnd(4);
		ll.inserAtEnd(5);
		
		ll.display();
		System.out.println(ll.size);
		
		ll.inserAtEnd(55);
		
		ll.display();
	    
	    System.out.println(ll.size);
	    
	    ll.insertAtHead(99);
	    ll.display();
	    
	    ll.insertAtindex(2, 100);
	    ll.display();
	    
	    ll.deleteAt(3);
	    ll.display();
 
	   
	   
	}

}
