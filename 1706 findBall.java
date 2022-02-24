class Solution {
    int m, n;
    int[][] g;

    public int[] findBall(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        g = grid;

        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
            ans[i] = getVal(i);

        return ans;
    }

    public int getVal(int x) {
        int r = 0, c = x;

        while(r < m) {
            int ne = c + g[r][c];

            if(ne < 0 || ne >= n)
                return -1;

            if(g[r][c] != g[r][ne])
                return -1;

            r++;
            c = ne;
        }

        return c;
    }
}
