public class basicLinkedList {
       
 public static class Node {
	
	 int data;
	 
	 Node next;
	Node(int data) {
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
	 
	 System.out.print(a+" -> ");
	 System.out.print(b+"->");
	 System.out.print(c+"->");
	 System.out.print(d);
	
	 System.out.print(a.data+"->");
	 System.out.print(a.next.data+"->");
	 System.out.print(b.next.data+"->");
	 System.out.print(c.next.data+"->");
	 System.out.print(d.next.data);
  }
}
