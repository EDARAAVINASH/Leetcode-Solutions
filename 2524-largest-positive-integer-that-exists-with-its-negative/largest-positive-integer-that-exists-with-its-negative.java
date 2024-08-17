class Solution {
    public int findMaxK(int[] nums) 
    {
        int max1=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(set.contains(-i))
            {
                max1=Math.max(max1,Math.abs(i));
            }
            else
            {
                set.add(i);
            }
        }    
        return max1;
    }
}