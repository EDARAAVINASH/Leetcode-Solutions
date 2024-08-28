class Solution {
    public int largestAltitude(int[] gain) 
    {
        int maxi=Integer.MIN_VALUE;
        int ans[]=new int[gain.length+1];
        ans[0]=0;
        for(int i=1;i<ans.length;i++)
        {
            ans[i]=ans[i-1]+gain[i-1];
        }
        for(int i:ans)
        {
            maxi=Math.max(i,maxi);
        }
        return maxi;
    }
}