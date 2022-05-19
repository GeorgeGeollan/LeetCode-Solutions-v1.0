class Solution {
    public int minMoves2(int[] nums) {
        int ans = 0;
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n / 2; i++) {
            ans += nums[n - i - 1] - nums[i];
        }

        return ans;
    }
}
