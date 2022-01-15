class Solution {
    public int totalMoney(int n) {
        int[] res = new int[]{1,2,3,4,5,6,7};
        int ans = 0;

        for(int i = 0; i < n; i++) {
            int rmd = i / 7;
            int mod = i % 7;
            ans += res[mod] + rmd;
        }

        return ans;
    }
}
