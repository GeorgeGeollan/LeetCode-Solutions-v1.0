class Solution {
    int m, n, k;
    int mod = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        this.m = m;
        this.n = n;
        this.k = maxMove;

        int[][] f = new int[m * n][k + 1];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0)
                    add(i, j, f);

                if(j == 0)
                    add(i, j, f);

                if(i == m - 1)
                    add(i, j, f);
                
                if(j == n - 1)
                    add(i, j, f);
            }
        }

        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for(int steps = 1; steps <= k; steps++) {
            for(int idx = 0; idx < m * n; idx++) {
                int x = parseIdx(idx)[0], y = parseIdx(idx)[1];

                for(int[] dir: dirs) {
                    int nx = x + dir[0], ny = y + dir[1];

                    if(nx >= 0 && nx <= m - 1 && ny >= 0 && ny <= n - 1) {
                        f[idx][steps] += f[getIdx(nx, ny)][steps - 1];
                        f[idx][steps] %= mod;
                    }
                }
            }
        }

        return f[getIdx(startRow, startColumn)][k];

    }

    void add(int i, int j, int[][] f) {
        int idx = getIdx(i, j);

        for(int steps = 1; steps <= k; steps++)
            f[idx][steps]++;

    }

    int getIdx(int x, int y) {
        return x * n + y;
    }

    int[] parseIdx(int idx) {
        return new int[] {idx / n, idx % n};
    }
}
