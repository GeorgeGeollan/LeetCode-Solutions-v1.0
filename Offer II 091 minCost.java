class Solution {
    public int minCost(int[][] costs) {
        int n = costs.length;
        int a = costs[0][0], b = costs[0][1], c = costs[0][2];
        for(int i = 1; i < n; i++) {
            int d = Math.min(b, c) + costs[i][0];
            int e = Math.min(a, c) + costs[i][1];
            int f = Math.min(a, b) + costs[i][2];
            a = d;
            b = e;
            c = f;
        }

        return Math.min(a, Math.min(b, c));
    }
}a
