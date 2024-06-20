class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int s=0;
        for(int n:nums)
        {
            h.put(n,h.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(e.getValue()==2)
            {
                s=s^e.getKey();
            }
        }
        return s;
    }
}

