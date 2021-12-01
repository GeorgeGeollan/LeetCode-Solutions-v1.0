class Solution1 {
    public int rob(int[] nums) {
        int max = 0, n = nums.length;
        int dp[] = new int[n + 1];
        
        if(n == 1)
            return nums[0];

        if(n == 2)
            return Math.max(nums[0], nums[1]);

        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = nums[1];
        
        max = Math.max(dp[1], dp[2]);

        for(int i = 3; i <= n; i++) {
            dp[i] = nums[i - 1] + Math.max(dp[i - 2], dp[i - 3]);
            max = Math.max(max, dp[i]);
        }


        return max;
    }
}

class Solution2 {
    public int rob(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for(int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }
}
