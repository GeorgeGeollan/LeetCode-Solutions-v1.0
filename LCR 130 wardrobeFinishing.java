class Solution {
    int ans = 0;
    public int wardrobeFinishing(int m, int n, int cnt) {
        boolean[][] visited = new boolean[m][n];
        dfs(0, 0, m, n, cnt, visited);
        
        return ans;
    }

    public void dfs(int i, int j, int m, int n, int cnt, boolean[][] visited) {
        if(i >= m || j >= n || digit(i) + digit(j) > cnt || visited[i][j]) {
            return;
        }

        ans++;
        visited[i][j] = true;
        dfs(i + 1, j, m, n, cnt, visited);
        dfs(i, j + 1, m, n, cnt, visited);
    }

    public int digit(int num) {
        int sum = 0;

        while(num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }
}
