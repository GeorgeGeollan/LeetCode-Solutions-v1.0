class Solution {
    public boolean canJump(int[] nums) {
        int target = 0, n = nums.length;
        for(int i = 0; i < n; i++) {
            target = Math.max(nums[i] + i, target);
            if(target == n - 1) {
                return true;
            }

            if(target <= i) {
                return false;
            }
        }

        return true;
    }
}
