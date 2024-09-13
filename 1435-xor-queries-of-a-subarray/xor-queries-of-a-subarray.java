class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) 
    {
        int n=arr.length;
        int[] pre=new int[n];
        int[] ans=new int[queries.length];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=arr[i]^pre[i-1];
        }
        for(int i=0;i<queries.length;i++)
        {
            int start=queries[i][0];
            int end=queries[i][1];
            if(start==0) 
            {
                ans[i]=pre[end];
            }
            else
            {
                ans[i]=pre[start-1]^pre[end];
            }
        }
        return ans;
    }
}