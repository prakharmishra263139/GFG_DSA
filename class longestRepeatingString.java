class longestRepeatingString {
    static String longestSubstring(String s, int n) {
       
        int arr[][] = new int[n+1][n+1];
        int max =0;
        int index=-1;
        
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(j-1)){
                    arr[i][j] = 1+arr[i-1][j-1];
                    
                    if(max<Math.min(j-i,arr[i][j])){
                        index = j;
                        max = Math.min(j-i,arr[i][j]);
                    }
                }
            }
        }
        
        if(index==-1) return "-1";
        
        return s.substring(index-max,index);
    }
};