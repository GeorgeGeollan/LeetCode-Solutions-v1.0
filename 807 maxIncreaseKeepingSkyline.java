class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rm = new int[m];
        int[] cm = new int[n];
        int ans = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                rm[i] = Math.max(rm[i], grid[i][j]);
                cm[j] = Math.max(cm[j], grid[i][j]);
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans += Math.min(cm[i], rm[j]) - grid[i][j];
            }
        }

        return ans;
    }
}
