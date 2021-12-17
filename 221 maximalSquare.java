class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        
        int r = matrix.length, c = matrix[0].length;
        int[][] dp = new int[r][c];
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(matrix[i][j] == '1')
                    if(i == 0 || j == 0)
                        dp[i][j] = 1;
                
                else
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                
                maxSide = Math.max(maxSide, dp[i][j]);
                    
            }
        }
        
        return maxSide * maxSide;
    }
}
