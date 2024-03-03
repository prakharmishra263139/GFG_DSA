import java.util.*;
class largestNumberFormed {
    String printLargest(int n, String[] arr) {
        
        Comparator<String> cp = new Comparator<String>() {
            public int compare(String st1, String st2) {
                String s1 = st1 + st2;
                String s2 = st2 + st1;
                
                return s2.compareTo(s1); 
            }
        };
      
        Arrays.sort(arr, cp);
      
        StringBuilder res = new StringBuilder();
        for (String s : arr) {
            res.append(s);
        }
        return res.toString();
    }
}