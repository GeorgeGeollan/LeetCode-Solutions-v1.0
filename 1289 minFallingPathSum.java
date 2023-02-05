class Solution1 {
    public int minFallingPathSum(int[][] grid) {
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            dp[0][i] = grid[0][i];
        }
            

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for(int l = 0; l < n; l++) {
                    if(j != l)
                        dp[i][j] = Math.min(dp[i - 1][l] + grid[i][j], dp[i][j]);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            if(min > dp[n - 1][i])
                min = dp[n - 1][i];
        }

        return min;
    }
}

class Solution2 {
    public int minFallingPathSum(int[][] grid) {
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        int min = Integer.MAX_VALUE, max = Integer.MAX_VALUE;
        int i1 = -1, i2 = -1;

        for(int i = 0; i < n; i++) {
            dp[0][i] = grid[0][i];

            if(grid[0][i] < (i1 == -1 ? max : dp[0][i1])) {
                i2 = i1;
                i1 = i;
            }

            else if(grid[0][i] < (i2 == -1 ? max : dp[0][i2]))
                i2 = i;
        }
            

        for(int i = 1; i < n; i++) {
            int ti1 = -1, ti2 = -1;
            for(int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                
                if(j != i1)
                    dp[i][j] = dp[i - 1][i1] + grid[i][j];
                
                else
                    dp[i][j] = dp[i - 1][i2] + grid[i][j];

                if(dp[i][j] < (ti1 == -1 ? max : dp[i][ti1])) {
                    ti2 = ti1;
                    ti1 = j;
                }
                
                else if(dp[i][j] < (ti2 == -1 ? max : dp[i][ti2]))
                    ti2 = j;

            }

            i1 = ti1;
            i2 = ti2;
        }

        for(int i = 0; i < n; i++) {
            if(min > dp[n - 1][i])
                min = dp[n - 1][i];
        }

        return min;
    }
}
