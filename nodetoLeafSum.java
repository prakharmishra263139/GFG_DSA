class nodetoLeafSum{
    static int ans =Integer.MIN_VALUE,maxCount=0;
    
    static void help(Node root, int sum ,int count){
        if(root == null){
            if(count>maxCount){
                ans = sum;
                maxCount=count;
            }else if(count  == maxCount){
                ans = Math.max(ans,sum);
            }
            return ;
        }
        
        sum  = sum+root.data;
        count++;
        help(root.left,sum,count);
        help(root.right,sum,count);
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int sum=0,count=0;
        ans = Integer.MIN_VALUE;
        maxCount=0;
        help(root,sum,count);
        return ans;
    }
}