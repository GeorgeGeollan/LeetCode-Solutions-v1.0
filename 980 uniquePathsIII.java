class Solution {
    boolean[][] visited;
    int count;
    int ans;
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int uniquePathsIII(int[][] grid) {
        int idx = 0, idy = 0;
        count = 0;
        ans = 0;
        visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    idx = i;
                    idy = j;
                }

                else if(grid[i][j] == 0)
                    count++;
            }
        }

        dfs(grid, idx, idy, 0);
        
        return ans;
    }

    public void dfs(int[][] grid, int x, int y, int len) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || visited[x][y] || grid[x][y] == -1)
            return;

        if(grid[x][y] == 2) {
            if(len - 1 == count)
                ans++;
        }

        len++;
        visited[x][y] = true;
        for(int[] dir: dirs) {
            int i = dir[0] + x;
            int j = dir[1] + y;
            dfs(grid, i, j, len);
        }

        visited[x][y] = false;
    }
}
