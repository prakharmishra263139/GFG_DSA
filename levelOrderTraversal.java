import java.util.*;
class levelOrderTraversal
{
    
    static ArrayList <Integer> levelOrder(Node root) 
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<Node> res = new LinkedList<>();
        
        res.add(root);
        
        while(!res.isEmpty()){
            Node rem = res.remove();
            
            list.add(rem.data);
            
            if(rem.left!=null){
                res.add(rem.left);
            }
            
            if(rem.right!=null){
                res.add(rem.right);
            }
        }
        
        return list;
        
    }
}
