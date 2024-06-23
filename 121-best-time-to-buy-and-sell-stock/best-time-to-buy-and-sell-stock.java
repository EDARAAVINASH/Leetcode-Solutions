class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int maxpro=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int profit=prices[i]-min;
            maxpro=Math.max(profit,maxpro);
            min=Math.min(min,prices[i]);
        }
        return maxpro;
    }
}