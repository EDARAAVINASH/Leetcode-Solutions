class Solution {
    public int minBitFlips(int start, int goal) 
    {
        int value=start^goal;
        return Integer.bitCount(value);    
    }
}