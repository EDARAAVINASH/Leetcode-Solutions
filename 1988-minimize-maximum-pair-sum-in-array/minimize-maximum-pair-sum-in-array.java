class Solution {
    public int minPairSum(int[] nums) 
    {
        int max_sum=Integer.MIN_VALUE;
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len/2;i++)
        {
            max_sum=Math.max(max_sum,nums[i]+nums[len-i-1]);
        }
        return max_sum;
    }
}