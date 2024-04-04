/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next=null;
    }
}
public class MainPalindrome
{
    Node head =null;
    int size = 0; 
    void add(int d)
    {
        Node n = new Node(d);
        if (head==null)
        {
            head = n;

        }
        else{
            Node current =head;
            while(current.next !=null)
            {
                current = current.next;
            }
            current.next =n;
        }
        size++;

    }

    Node reverse(Node h){

        Node current =h;
        Node prev=null;
        Node next=null;

        while(current!=null){
            next= current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        return prev;

    }
    boolean palindrome(Node h){

        int mid = (size%2==0) ? size/2 : (size+1)/2;
        Node curr = h;
        for(int i=1;i<mid;i++){
            curr=curr.next;
        }
        Node rev  = reverse(curr.next);
        while(h!=null && rev!=null){
            if(h.data !=rev.data){
                return false;
            }
           h=h.next;
           rev  = rev.next;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        Main m=new Main();

     Scanner sc = new Scanner (System.in);
     String s  = sc.nextLine();  //"1 2 3 1 2"
     String sarr[] = s.split("\\s+"); //{"1" "2"}
     for (int i=0;i<sarr.length;i++)
     {
         m.add(Integer.parseInt(sarr[i]));
     }

     System.out.println(m.palindrome(m.head));

	}
}