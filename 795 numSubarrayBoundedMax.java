class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }

    public int count(int[] nums, int left) {
        int ans = 0, cnt = 0;

        for(int x: nums) {
            cnt = x <= left ? cnt + 1 : 0;
            ans += cnt;
        }

        return ans;
    }
}
