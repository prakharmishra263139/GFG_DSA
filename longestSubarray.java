/*class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        
        int count =0;
        
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
                sum = sum+A[j];
                if(sum == K){
                    count = Math.max(count ,j-i+1);
                }
            }
        }
        
        return count;
    }
    
    
}*/

import java.util.*;
class longestSubarray {
    public static int lenOfLongSubarr (int A[], int N, int K) {
    
        int sum=0;
        int max=0;
        HashMap<Integer,Integer>mp =new HashMap<>();
        for(int i=0;i<N;i++){
            sum = sum+A[i];
            
            if(sum==K) max = Math.max(max,i+1);
            
            if(mp.containsKey(sum-K)){
                max = Math.max(max,i-mp.get(sum-K));
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        
        return max;
    }
}
