class Solution {
    public int minTimeToType(String word) 
    {
        char start='a';
        int sum=0;
        for(char c:word.toCharArray())
        {
            int diff=Math.abs(c-start);
            sum=sum+Math.min(diff,26-diff);
            start=c;
        }    
        return sum+word.length();
    }
}