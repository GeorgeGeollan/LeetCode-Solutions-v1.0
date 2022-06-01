class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;

        for(int match: matchsticks) {
            sum += match;
        }

        if(sum % 4 != 0)
            return false;

        int avg = sum / 4;

        Arrays.sort(matchsticks);

        for(int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        int[] edges = new int[4];

        return dfs(0, matchsticks, edges, avg);
    }

    public boolean dfs(int idx, int[] matchsticks, int[] edges, int avg) {
        if(idx == matchsticks.length)
            return true;

        for(int i = 0; i < edges.length; i++) {
            edges[i] += matchsticks[idx];

            if(edges[i] <= avg && dfs(idx + 1, matchsticks, edges, avg))
                return true;

            edges[i] -= matchsticks[idx];
        }

        return false;
    }
}
