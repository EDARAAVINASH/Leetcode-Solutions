class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            lsum=lsum+cardPoints[i];
        }
        int maxsum=lsum;
        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[right];
            right--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}