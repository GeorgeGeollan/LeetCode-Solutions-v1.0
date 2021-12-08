class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] cnt = new int[10001];
        int max = 0, n = nums.length;

        for(int i = 0; i < n; i++) {
            cnt[nums[i]]++;
            max = Math.max(nums[i], max);
        }

        int[][] dp = new int[max + 1][2];

        for(int i = 1; i <= max; i++) {
            dp[i][1] = dp[i - 1][0] + cnt[i] * i;
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }

        return Math.max(dp[max][0], dp[max][1]);
    }
}
