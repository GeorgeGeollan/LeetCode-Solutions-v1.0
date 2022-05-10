class Solution {
    List<List<Integer>> ans;
    int k, n;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        this.k = k;
        this.n = n;
        dfs(1, new ArrayList<>(), 0);
        
        return ans;
    }
    
    public void dfs(int a, List<Integer> cur, int sum) {
        if(cur.size() == k && sum == n) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        
        if(a == 10 || sum > n || cur.size() > k) {
            return;
        }
        
        cur.add(a);
        dfs(a + 1, cur, sum + a);
        cur.remove(cur.size() - 1);
        dfs(a + 1, cur, sum);
    }
}
