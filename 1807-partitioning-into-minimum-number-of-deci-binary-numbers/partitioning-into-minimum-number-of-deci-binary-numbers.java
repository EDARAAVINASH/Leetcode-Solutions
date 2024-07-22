class Solution {
    public int minPartitions(String n) 
    {
        int maxi=Integer.MIN_VALUE;
        for(char c:n.toCharArray())
        {
            int val=Character.getNumericValue(c);
            maxi=Math.max(val,maxi);
        }    
        return maxi;
    }
}