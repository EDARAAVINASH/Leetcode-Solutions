class Solution {
    public int[] decode(int[] encoded, int first) {
        int l=encoded.length;
        int fir[]=new int[l+1];
        fir[0]=first;
        for(int i=1;i<l+1;i++)
        {
            fir[i]=(fir[i-1])^(encoded[i-1]);
        } 
        return fir;
    }
}