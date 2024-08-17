class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int len=nums.length;
        int[] ans=new int[len];
        int i=len-1;
        for(int r=len-1,l=0;l<=r;)
        {
            if(Math.abs(nums[r])>Math.abs(nums[l]))
            {
                ans[i--]=nums[r]*nums[r];
                r--;
            }
            else
            {
                ans[i--]=nums[l]*nums[l];
                l++;
            }
        } 
        return ans;   
    }
}