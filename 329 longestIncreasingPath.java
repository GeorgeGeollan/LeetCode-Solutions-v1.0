class Solution {
    int m, n ;
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int[][] mem = new int[m][n];
        int ans = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mem[i][j] == 0) {
                    ans = Math.max(ans, dfs(matrix, mem, i, j));
                }
            }
        }
        
        return ans;   
    }
    
    public int dfs(int[][] matrix, int[][] mem, int i, int j) {
        if(mem[i][j] != 0)
            return mem[i][j];
        
        int ans = 1;
        for(int[] dir: dirs) {
            int newX = dir[0] + i;
            int newY = dir[1] + j;
            
            if(newX >= 0 && newY >= 0 && newX < m && newY < n && matrix[newX][newY] > matrix[i][j]) {
                ans = Math.max(ans, dfs(matrix, mem, newX, newY) + 1);
            }
        }
        
        mem[i][j] = ans;
        return ans;
    }
}
