class Solution {
    public int sumNums(int n) {
        return dfs(n);
    }

    public int dfs(int x) {
        if(x == 0) {
            return 0;
        }

        return x + dfs(x - 1);
    }
}
