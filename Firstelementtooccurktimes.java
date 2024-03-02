import java.util.*;
public class Firstelementtooccurktimes
{
    public int firstElementKTime(int n, int k, int[] a) { 
        
        Map<Integer,Integer>mp  = new HashMap<>();
        
        for(int i=0;i<n;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
        
            if(mp.containsKey(a[i])&& mp.get(a[i])==k){
                return a[i];
            }
        }
        
        return -1;
    } 
}