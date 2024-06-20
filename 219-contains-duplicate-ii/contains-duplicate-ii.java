class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(h.containsKey(a))
            {
                if(Math.abs((i-h.get(a)))<=k)
                    return true;
                else
                    h.put(a,i);
            }
            else
            {
                h.put(a,i);
            }
        }
        return false;
    }
}