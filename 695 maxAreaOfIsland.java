class Solution {
    int max = 0;
    int m, n;
    int cnt;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    cnt = 0;
                    dfs(grid, i, j);
                }
            }
        }

        return max;
    }

    public void dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != 1) {
            return;
        }

        if(grid[i][j] == 1)
            grid[i][j] = -1;
        cnt++;

        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);

        max = Math.max(max, cnt);
    }
}
