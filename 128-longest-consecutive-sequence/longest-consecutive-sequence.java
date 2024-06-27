class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int len=1;
        int max=Integer.MIN_VALUE;
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else if(nums[i+1]-nums[i]==1)
            {
                len++;
            }
            else
            {
                max=Math.max(len,max);
                len=1;
            }
        }
        max=Math.max(len,max);
        return max;
    }
}