class Solution {
    public int minCount(int[] coins) {
        int ans = 0;

        for(int coin: coins) {
            ans += (coin / 2 + coin % 2);
        }

        return ans;
    }
}
