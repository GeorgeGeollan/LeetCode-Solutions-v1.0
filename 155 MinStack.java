class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];

        int max = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            sum = sum < 0 ? nums[i] : sum + nums[i];
            max = Math.max(sum, max);
            dp[i] = max;
        }

        
        return dp[nums.length - 1];
    }
}
