class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int sum=0;
        int[] left=new int[len];
        int[] right=new int[len];
        left[0]=height[0];
        right[len-1]=height[len-1];
        for(int i=1;i<len;i++)
        {
            int max=Math.max(height[i],left[i-1]);
            left[i]=max;
        }
        for(int i=len-2;i>=0;i--)
        {
            int max=Math.max(height[i],right[i+1]);
            right[i]=max;
        }
        for(int i=0;i<len;i++)
        {
            sum+=Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }
}