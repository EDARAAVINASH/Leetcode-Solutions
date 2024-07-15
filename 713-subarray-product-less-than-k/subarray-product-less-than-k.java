class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r=0,l=0,n=nums.length,prod=1,count=0;
        while(r<n)
        {
            prod=prod*nums[r];
                while(prod>=k && l<=r)
                {
                    prod=prod/nums[l];
                    l++;
                }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}