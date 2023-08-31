class Solution {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;

        for(int i = 1; i < n; i++) {
            int min = Math.min(Math.min(2 * dp[a], 3 * dp[b]), 5 * dp[c]);
            dp[i] = min;

            if(min == 2 * dp[a]) {
                a++;
            }

            if(min == 3 * dp[b]) {
                b++;
            }

            if(min == 5 * dp[c]) {
                c++;
            }
        }

        return dp[n - 1];
    }
}
