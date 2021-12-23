class Solution {
    int mod = 1000000007;
    int[][] cache;
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        cache = new int[n][fuel + 1];

        for(int i = 0; i < n; i++)
            Arrays.fill(cache[i], -1);

        int count = dfs(locations, start, finish, fuel);

        return count;
    }

    public int dfs(int[] locations, int start, int finish, int fuel) {
        if(cache[start][fuel] != -1)
            return cache[start][fuel];

        int need = Math.abs(locations[start] - locations[finish]);

        if(need > fuel) {
            cache[start][fuel] = 0;
            return 0;
        }

        int n = locations.length;

        int sum = start == finish ? 1 : 0;

        for(int i = 0; i < n; i++) {
            if(i != start) {
                need = Math.abs(locations[i] - locations[start]);

                if(fuel >= need) {
                    sum += dfs(locations, i, finish, fuel - need);
                    sum %= mod;
                }
            }
        }

        cache[start][fuel] = sum;

        return sum;
    }
}
