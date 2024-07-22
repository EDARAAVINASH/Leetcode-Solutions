class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
        int maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }    
        for(int val:map.values())
        {
            maxi=Math.max(val,maxi);
            mini=Math.min(val,mini);
        }
        if(maxi==mini) return true;
        return false;
    }
}