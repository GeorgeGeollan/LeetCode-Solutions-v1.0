class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++)
            Arrays.fill(dp[i], n);

        for(int[] m: mines)
            dp[m[0]][m[1]] = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0, k = n - 1, l = 0, r = 0, u = 0, d = 0; j < n; j++, k--)
            {
                dp[i][j] = Math.min(dp[i][j], l = (dp[i][j] == 0) ? 0 : l + 1);
                dp[i][k] = Math.min(dp[i][k], r = (dp[i][k] == 0) ? 0 : r + 1);
                dp[j][i] = Math.min(dp[j][i], u = (dp[j][i] == 0) ? 0 : u + 1);
                dp[k][i] = Math.min(dp[k][i], d = (dp[k][i] == 0) ? 0 : d + 1);
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                max = Math.max(max, dp[i][j]);
        }

        return max;
    }
}
