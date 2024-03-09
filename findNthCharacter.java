import java.util.*;
class findNthCharacter
{
    public char nthCharacter(String s, int r, int n)
    {
        StringBuilder st  = new StringBuilder();
        while(r!=0){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') st.append("10");
                
                else st.append("01");
                
                if(st.length()>n) 
                break;
            }
            
            s = st.toString();
            st.setLength(0);
            r--;
        }
        
        return s.charAt(n);
    }
}