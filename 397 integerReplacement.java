class Solution {
    HashMap<Long, Integer> map;
    public int integerReplacement(int n) {
        map = new HashMap<>();

        return dfs(n * 1L);
    }

    public int dfs(long n) {
        if(n == 1)
            return 0;

        if(map.containsKey(n))
            return map.get(n);

        int ans = n % 2 == 0 ? dfs(n / 2) : Math.min(dfs(n - 1), dfs(n + 1));

        map.put(n, ++ans);

        return ans;
    }
}
