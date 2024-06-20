class Solution {
    public int[] findErrorNums(int[] nums) {
        int a[]=new int[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                a[0]=nums[i];
                break;
            }
        }
        int sum=0;
        for(int num:nums)
        {
            sum=sum+num;
        }
        int x=nums.length;
        a[1]=x*(x+1)/2-sum+a[0];
        return a;
    }
}