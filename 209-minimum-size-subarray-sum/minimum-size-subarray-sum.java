class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int low=0,high=0,length=nums.length,total_sum=0,min_length=Integer.MAX_VALUE;
        while(high<length)
        {
            total_sum+=nums[high];
            while(total_sum>=target && low<=high)
            {
                min_length=Math.min(min_length,high-low+1);
                total_sum-=nums[low];
                low++;
            }
            high++;
        }    
        return min_length==Integer.MAX_VALUE?0:min_length;
    }
}