class Solution {
    public int projectionArea(int[][] grid) {
        int ans1 = 0, ans2 = 0, ans3 = 0;
        int n = grid.length;

        for(int i = 0; i < n; i++) {
            int a = 0, b = 0;

            for(int j = 0; j < n; j++) {
                if(grid[i][j] > 0)
                    ans1++;

                a = Math.max(a, grid[i][j]);
                b = Math.max(b, grid[j][i]);
            }

            ans2 += a;
            ans3 += b;
        }

        return ans1 + ans2 + ans3;
    }
}
