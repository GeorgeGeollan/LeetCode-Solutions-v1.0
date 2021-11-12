class Solution {
    int[][] cache = new int[201][201];

    public int getMoneyAmount(int n) {
        return dfs(1, n);
    }

    public int dfs(int l, int r) {
        if(l >= r)
            return 0;

        if(cache[l][r] != 0)
            return cache[l][r];

        int ans = 0x3f3f3f;

        for(int i = l; i <= r; i++) {
            int cur = Math.max(dfs(l, i - 1), dfs(i + 1, r)) + i;

            ans = Math.min(ans, cur);
        }

        cache[l][r] = ans;
        return ans;
    }
}
