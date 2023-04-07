class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();

        int m = target.length;

        for(int i = 1, j = 0; i <= n && j < m; i++) {
            ans.add("Push");

            if(target[j] != i) {
                ans.add("Pop");
            }
                
            else
                j++;
        }

        return ans;
    }
}
