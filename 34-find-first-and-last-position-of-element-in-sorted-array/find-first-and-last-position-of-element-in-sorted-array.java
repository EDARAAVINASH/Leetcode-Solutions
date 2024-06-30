class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=startPosition(nums,target);
        int last=endPosition(nums,target);
        if(first==-1)
        {
            return new int[]{-1,-1};
        }
        return new int[]{first,last};
    }
    public static int startPosition(int[] nums,int target)
    {
        int n=nums.length;
        int ans=-1;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                 high=mid-1;
            }
        }
        return ans;
    }
    public static int endPosition(int[] a,int target)
    {
        int ans=-1;
        int n=a.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==target)
            {
                low=mid+1;
                ans=mid;
            }
            else if(a[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}