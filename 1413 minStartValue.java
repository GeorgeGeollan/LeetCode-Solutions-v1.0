class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];

        ## 定义一个最小值
        int min = 1;
        dp[0] = nums[0];
        min = dp[0];

        for(int i = 1; i < n; i++) {
            ## 从左往右遍历求和，若该值小于最小值，更新最小值
            dp[i] = nums[i] + dp[i - 1];
            min = Math.min(min, dp[i]);
        }

        ## 判断最小值是否大于0，若大于0，返回最小整数1，否则返回1 - min
        if(min > 0)
            return 1;

        return 1 - min;
    }
}
