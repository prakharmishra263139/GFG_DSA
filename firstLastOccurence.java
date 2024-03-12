import java.util.*;
class firstLastOccurence {
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        int i =0;
        int j=n-1;
        
        ArrayList<Integer>list = new ArrayList<>();
        list.add(-1);
        list.add(-1);
        
        while(i<=j){
            if(arr[i] ==x  && arr[j] ==x){
                list.add(0,i);
                list.add(1,j);
                break;
            }
            
            if(arr[i]!=x){
                i++;
            }
            
            if(arr[j]!=x){
                j--;
            }
            
            
        }
        
        return list;
    }
}
