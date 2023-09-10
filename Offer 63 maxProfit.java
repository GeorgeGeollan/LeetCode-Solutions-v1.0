class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0;
        int n = prices.length;
        int minNum = prices[0];

        for(int i = 1; i < n; i++) {
            if(prices[i] - minNum > max) {
                max = prices[i] - minNum;
            }

            if(minNum > prices[i]) {
                minNum = prices[i];
            }
        }

        return max;
    }
}
