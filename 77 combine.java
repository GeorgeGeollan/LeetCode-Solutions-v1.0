class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        combineHelper(n, k, 1);
        return ans;
    }

    public void combineHelper(int n, int k, int start) {
        if(path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            combineHelper(n, k, i + 1);
            path.removeLast();
        }
    }
}
