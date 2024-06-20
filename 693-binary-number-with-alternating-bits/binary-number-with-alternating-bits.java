class Solution {
    public boolean hasAlternatingBits(int n) {
        int y=(n^(n>>1));
        return (y & (y+1))==0;
    }
}