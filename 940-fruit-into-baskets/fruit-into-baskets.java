class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int l=0,r=0;
        int n=fruits.length,maxlen=0;
        while(r<n)
        {
            map.put(fruits[r],r);
            if(map.size()>2)
            {
                int min=Integer.MAX_VALUE;
                for(int idx:map.values())
                {
                    min=Math.min(idx,min);
                }
                map.remove(fruits[min]);
                l=min+1;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}