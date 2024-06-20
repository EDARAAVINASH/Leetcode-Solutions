class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s=new TreeSet();
        for(int i:nums)
        {
            s.add(i);
            if(s.size()>3)
            {
                s.pollFirst();
            }
        }
        if(s.size()<3)
        {
            return s.last();
        }
        return s.first();
    }
}