class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> set=new TreeSet();
        for(int num:nums)
        {
            if(num>0)
            {
                set.add(num);
            }
        }
        int i=1;
        while(set.contains(i))
        {
            i++;
        }
        return i;
    }
}