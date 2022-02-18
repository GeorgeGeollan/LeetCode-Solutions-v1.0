class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] cnt = new int[n + 1];

        for(int[] edge: edges) {
            if(++cnt[edge[0]] > 1)
                return edge[0];

            if(++cnt[edge[1]] > 1)
                return edge[1];
        }

        return -1;
    }
}
