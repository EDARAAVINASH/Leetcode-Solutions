class Solution {
    public int maxArea(int[] height) 
    {
        int maxarea=Integer.MIN_VALUE;
        int left=0,right=height.length-1;
        while(left<right)
        {
            int maxi=Math.min(height[left],height[right]);
            maxarea=Math.max(maxarea,(right-left)*maxi);
            if(height[left]<height[right]) left++;
            else right--;
        }    
        return maxarea;
    }
}