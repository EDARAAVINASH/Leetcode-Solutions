class Solution {
    public int[] shortestToChar(String s, char c) 
    {
        int len=s.length();
        int[] ans=new int[len];
        int prev=-len;
        for(int i=0;i<len;i++)
        {
            char curr=s.charAt(i);
            if(curr==c)
            {
                prev=i;
            }
            ans[i]=i-prev;
        }
        prev=2*len;
        for(int i=len-1;i>=0;i--)
        {
            char curr=s.charAt(i);
            if(curr==c)
            {
                prev=i;
            }
            ans[i]=Math.min(ans[i],prev-i);
        }
        return ans;
    }
}