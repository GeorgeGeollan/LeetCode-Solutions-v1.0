class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1)
            return nums[0];
            
        int sum = 0;
        int ans = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                sum += nums[i];
            }

            else {
                sum += nums[i];
                ans = Math.max(ans, sum);
                sum = 0;
            }
        }

        if(nums[nums.length - 2] < nums[nums.length - 1]) {
            sum += nums[nums.length - 1];
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
