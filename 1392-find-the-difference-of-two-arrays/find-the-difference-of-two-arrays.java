class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums1)
        {
            set1.add(i);
        }
        for(int i:nums2)
        {
            set2.add(i);
        }
        List<List<Integer>> list1=new ArrayList<>();
        for(int i:nums1)
        {
            if(set2.contains(i))
            {
                set2.remove(i);
            }
        }
        for(int i:nums2)
        {
            if(set1.contains(i))
            {
                set1.remove(i);
            }
        }
        list1.add(new ArrayList(set1));
        list1.add(new ArrayList(set2));
        return list1;
    }
}