class Solution {
    public List<Integer> findLonely(int[] nums) 
    {
        Map<Integer,Integer> list1=new HashMap<>();
        List<Integer> list2=new ArrayList<>();
        for(int i:nums)
        {
            list1.put(i,list1.getOrDefault(i,0)+1);
        }  
        for(int i:nums)
        {
            if(!list1.containsKey(i-1) && list1.get(i)==1 && !list1.containsKey(i+1))
            {
                list2.add(i);
            }
        }  
        return list2;

    }
}