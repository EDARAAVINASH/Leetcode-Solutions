class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
       int pre=1,suf=1;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
            pre*=nums[i];
            suf*=nums[n-i-1];
            max=Math.max(max,Math.max(pre,suf));
            if(pre==0) pre=1;
            if(suf==0) suf=1;
       } 
       return max;
    }
}