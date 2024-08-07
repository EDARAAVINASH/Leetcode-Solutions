class Solution {
    public double minimumAverage(int[] nums) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Double> al=new ArrayList<>();
        int low=0,high=n-1;
        while(low<high)
        {
            double avg=(nums[low]+nums[high])/2.0;
            al.add(avg);
            low++;
            high--;
        }   
        return Collections.min(al);
    }
}