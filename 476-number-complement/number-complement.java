class Solution {
    public int findComplement(int num) {
        int n=Integer.highestOneBit(num);
        int x=num^(n+n-1);
        return x;
    }
}