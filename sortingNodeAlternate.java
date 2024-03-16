import java.util.*;
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
class sortingNodeAlternate {
    
   public Node sort(Node head){
        ArrayList<Integer>list =new ArrayList<>();
        Node temp =head;
        
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        
        Collections.sort(list);
        
        temp =head;
        int i=0;
        
        while(temp!=null){
            temp.data = list.get(i++);
            temp=temp.next;
        }
        
        return head;
   }


}