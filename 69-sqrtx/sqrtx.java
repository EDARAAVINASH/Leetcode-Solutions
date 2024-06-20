class Solution {
    public int mySqrt(int x) {
        int val=0;
        for(long i=0;i<=Math.sqrt(x);i++)
        {
            if(i*i<=x)
            {
                val=(int)i;
            }
        }
        return val;
    }
}