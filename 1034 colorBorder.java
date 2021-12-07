class Solution {
    int m, n, c;
    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        m = grid.length;
        n = grid[0].length;
        c = color;
        
        int[][] ans = new int[m][n];

        dfs(grid, ans, row, col);

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                if(ans[i][j] == 0)
                    ans[i][j] = grid[i][j];
        }

        return ans;
    }

    public void dfs(int[][] grid, int[][] ans, int i, int j) {
        int cnt = 0;
        for(int[] dir: dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != grid[i][j])
                continue;

            else
                cnt++;
            if(ans[x][y] != 0)
                continue;

            ans[x][y] = -1;
            dfs(grid, ans, x, y);
        }

        ans[i][j] = cnt == 4 ? grid[i][j] : c;
    }
}
