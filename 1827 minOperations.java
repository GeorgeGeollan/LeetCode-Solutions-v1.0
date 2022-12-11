class Solution {
    public int minOperations(int[] nums) {
        int max = nums[0];
        int ans = 0;

        for(int i = 1; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                continue;
            }

            else {
                ans += max + 1 - nums[i];
                max = max + 1;
            }
        }

        return ans;
    }
}
