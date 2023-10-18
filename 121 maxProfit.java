class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, n = prices.length;
        int minPrices = prices[0];

        for(int i = 1; i < n; i++) {
            if(minPrices > prices[i]) {
                minPrices = prices[i];
                continue;
            }
            int profit = prices[i] - minPrices;
            ans = profit > 0 ? Math.max(profit, ans) : ans;
        }

        return ans;
    }
}
