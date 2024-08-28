class Solution {
    public int longestSubarray(int[] nums) 
    {
        int l=0,r=0,zeros=0,maxi=0;
        while(r<nums.length)
        {
            if(nums[r]==0) zeros++;
            while(zeros>1)
            {
                if(nums[l]==0)
                {
                    zeros--;
                }
                l++;
            }
            maxi=Math.max(maxi,r-l);
            r++;
        }    
        return maxi > 0 ? maxi : 0;
    }
}