class Solution {
    int m, n, k;
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        
        this.visited = new boolean[m][n];

        int count = dfs(0, 0, 0, 0);

        return count;
    }

    public int dfs(int i, int j, int si, int sj)
    {
        if(i >= m || j >= n || visited[i][j] || k < si + sj)
            return 0;

        visited[i][j] = true;

        return 1 + dfs(i + 1, j, (i + 1) % 10 == 0 ? si - 8 : si + 1, sj) + dfs(i, j + 1, si, (j + 1) % 10 == 0 ? sj - 8 : sj + 1);
    }
}
