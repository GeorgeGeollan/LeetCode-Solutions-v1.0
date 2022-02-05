class Solution {
    int m, n, max;
    public int getMaximumGold(int[][] grid) {
        if(grid.length == 0)
            return 0;
            
        m = grid.length;
        n = grid[0].length;
        max = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0)
                    continue;
                max = Math.max(max, dfs(i, j, grid));
            }
        }

        return max;
    }

    public int dfs(int i, int j, int[][] grid) {
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0)
            return 0;

        int temp = grid[i][j];
        grid[i][j] = 0;
        int max = 0;
        int a = dfs(i - 1, j, grid);
        int b = dfs(i + 1, j, grid);
        int c = dfs(i, j - 1, grid);
        int d = dfs(i, j + 1, grid);

        max = Math.max(a, Math.max(b, Math.max(c, d)));
        grid[i][j] = temp;
        return max + grid[i][j];
    }
}
