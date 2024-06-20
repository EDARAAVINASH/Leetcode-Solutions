class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList();
        int c=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                c++;
            }
            else
            {
                if(c>nums.length/3)
                {
                    l.add(nums[i]);
                }
                c=1;
            }
        }
        if(c>nums.length/3)
        {
            l.add(nums[nums.length-1]);
        }
        return l;
    }
}