class Solution1 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp = new int[n][n];
        int ans = Integer.MAX_VALUE;
        dp[0][0] = triangle.get(0).get(0);

        for(int i = 1; i < n; i++) {
            for(int j = 0; j  < i + 1; j++) {
                int val = triangle.get(i).get(j);
                dp[i][j] = Integer.MAX_VALUE;
                if(j != 0)
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + val, dp[i][j]);

                if(j != i)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + val);

            }
        }

        for(int i = 0; i < n; i++)
            ans = Math.min(ans, dp[n - 1][i]);

        
        return ans;
    }
}

class Solution2 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp = new int[2][n];
        int ans = Integer.MAX_VALUE;
        dp[0][0] = triangle.get(0).get(0);

        for(int i = 1; i < n; i++) {
            for(int j = 0; j  < i + 1; j++) {
                int val = triangle.get(i).get(j);
                dp[i & 1][j] = Integer.MAX_VALUE;
                if(j != 0) {
                    dp[i & 1][j] = Math.min(dp[(i - 1) & 1][j - 1] + val, dp[i & 1][j]);
                }
                    

                if(j != i) {
                    dp[i & 1][j] = Math.min(dp[i & 1][j], dp[(i - 1) & 1][j] + val);
                }
                    

            }
        }

        for(int i = 0; i < n; i++)
            ans = Math.min(ans, dp[(n - 1) & 1][i]);

        
        return ans;
    }
}
