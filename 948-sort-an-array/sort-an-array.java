class Solution {
    public int[] sortArray(int[] nums) 
    {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergesort(int[] nums,int low,int high)
    {
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static void merge(int[] nums,int low,int mid,int high)
    {
        int[] sorted=new int[high-low+1];
        int i=low,j=mid+1;
        int k=0;
        while(i<=mid && j<=high)
        {
            if(nums[i]>nums[j])
            {
                sorted[k++]=nums[j++];
            }
            else
            {
                sorted[k++]=nums[i++];
            }
        }
        while(i<=mid)
        {
            sorted[k++]=nums[i++];
        }
        while(j<=high)
        {
            sorted[k++]=nums[j++];
        }
        System.arraycopy(sorted, 0, nums, low, sorted.length);
    }
}