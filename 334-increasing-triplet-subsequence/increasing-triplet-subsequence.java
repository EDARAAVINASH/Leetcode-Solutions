class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(first>=i)
            {
                first=i;
            }
            else if(second>=i)
            {
                second=i;
            }
            else
            {
                return true;
            }
        }    
        return false;
    }
}