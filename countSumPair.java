import java.util.*;
class countSumPair {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {   
        HashSet<Integer> hp = new HashSet<>(head2);
        
        int Pair=0;
        
        for(int n:head1){
            int rem = x-n;
            
            if(hp.contains(rem)){
                Pair++;
            }
        }
        return Pair;
        
    }
}