class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxpro = 0;
        for (int i = 1; i < n; i++) {
            if(prices[i-1]<prices[i])
            {
                maxpro+=prices[i]-prices[i-1];
            }
        }
        return maxpro;
    }
}