import java.util.*;
class stringMatchIndex
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        
        ArrayList<Integer>list =new ArrayList<>();
        
        int i = text.indexOf(pattern);
        while(i!=-1){
            list.add(i+1);
            i = text.indexOf(pattern,i+1);
        }
        
        return list;
    }
    
}