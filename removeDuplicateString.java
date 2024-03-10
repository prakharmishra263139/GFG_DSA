import java.util.*;
class removeDuplicateString {
    String removeDuplicates(String str) {
        
        StringBuilder st  = new StringBuilder();
        HashMap<Character,Integer>mp = new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            if(mp.get(str.charAt(i)) == null){
                st.append(str.charAt(i));
                mp.put(str.charAt(i),1);
            }
        }
    return st.toString();
    }
}