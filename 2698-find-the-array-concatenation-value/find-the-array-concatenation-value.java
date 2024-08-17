class Solution {
    public long findTheArrayConcVal(int[] nums) 
    {
        long ans=0;
        int len=nums.length;
        int l=0,r=len-1;    
        while(l<=r)
        {
            if(l==r)
            {
                ans+=nums[l];
                break;
            }
            else
            {
                int val=find(nums[r]);
                ans+=nums[l]*Math.pow(10,val)+nums[r];
                l++;r--;
            }
        }
        return ans;
    }
    int find(int r)
    {
        int c=0;
        while(r>0)
        {
            c++;
            r/=10;
        }
        return c;
    }

}