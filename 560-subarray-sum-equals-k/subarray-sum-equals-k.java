class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,c=0;
        for(int i:nums)
        {
            sum=sum+i;
            if(map.containsKey(sum-k))
            {
                c=c+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}