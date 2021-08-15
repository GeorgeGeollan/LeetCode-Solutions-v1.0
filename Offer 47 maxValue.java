class Solution1 {
    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(i - 1 < 0 && j - 1 < 0)
                    dp[i][j] = grid[i][j];

                else if(i - 1 < 0)
                    dp[i][j] = grid[i][j] +  dp[i][j - 1];

                else if(j - 1 < 0)
                    dp[i][j] = grid[i][j] + dp[i - 1][j];

                else
                {
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j]);
                }

                System.out.println(dp[i][j]);
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}

class Solution2 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 1; i < n; i++)
            grid[0][i] += grid[0][i - 1];

        for(int i = 1; i < m; i++)
            grid[i][0] += grid[i - 1][0];

        for(int i = 1; i < m; i++)
            for(int j = 1; j < n; j++)
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);

        return grid[m - 1][n - 1];
    }
}

