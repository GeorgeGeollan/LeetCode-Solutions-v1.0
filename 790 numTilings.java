class Solution {
    public int numTilings(int n) {
        int mod = 1000000009;
        long dp[] = new long[] {1, 0, 0, 0};
        
        for(int i = 0; i < n; i++) {
            long[] ndp = new long[4];
            ndp[0] = (dp[0] + dp[3]) % mod;
            ndp[1] = (dp[0] + dp[2]) % mod;
            ndp[2] = (dp[0] + dp[1]) % mod;
            ndp[3] = (dp[0] + dp[1] + dp[2]) % mod;
            dp = ndp;
        }

        return (int)dp[0];
    }
}
