class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i:set)
        {
            if(set.contains(i+diff) && set.contains(i+2*diff))
            {
                count++;
            }
        }
        return count;   
    }
}