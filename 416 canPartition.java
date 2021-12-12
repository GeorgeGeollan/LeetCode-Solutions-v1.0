class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }

        if(sum % 2 == 1)
            return false;

        sum = sum / 2;

        boolean[][] dp = new boolean[n][sum + 1];

        if(nums[0] <= sum)
            dp[0][nums[0]] = true;

        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];

                if(nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }

                if(nums[i] < j)
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
            }
        }

        return dp[n - 1][sum];
    }
}
