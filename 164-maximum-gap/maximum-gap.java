class Solution {
    public int maximumGap(int[] nums) {
        int max1=Integer.MIN_VALUE;
        if(nums.length<=1)
        {
            return 0;
        }
        else
        {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                int d=nums[i+1]-nums[i];
                max1=Math.max(max1,d);
            }
        }
        return max1;
    }
}