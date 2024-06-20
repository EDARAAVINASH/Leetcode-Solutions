class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
       HashSet<Integer> HashSet=new HashSet<>();
       for(int n:nums)
       {
            if(!HashSet.add(n))
            {
                return true;
            }
        }
        return false;
    }
}