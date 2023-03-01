class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;

        int l = n - 2;

        int[][] ans = new int[l][l];

        for(int i = 0; i <= n - 3; i++) {
            for(int j = 0; j < n - 2; j++) {
                ans[i][j] = max(i, j, grid);
            }
        }

        return ans;
    }

    public int max(int m, int n, int[][] grid) {
        int maxVal = 0;

        for(int i = m; i <= m + 2; i++) {
            for(int j = n; j <= n + 2; j++) {
                maxVal = Math.max(maxVal, grid[i][j]);
            }
        }

        return maxVal;
    }
}
