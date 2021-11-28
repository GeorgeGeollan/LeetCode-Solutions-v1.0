class Solution {
    int[][] g;
    int n;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        g = graph;
        n = graph.length;
        cur.add(0);
        dfs(0);

        return res;
    }

    public void dfs(int u) {
        if(u == n - 1) {
            res.add(new ArrayList<>(cur));
            return;
        }
            

        for(int v: g[u]) {
            cur.add(v);
            dfs(v);
            cur.remove(cur.size() - 1);
        }
    }
}
