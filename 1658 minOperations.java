class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }

        int target = sum - x;

        if(target < 0)
            return -1;

        int left = 0, right = 0, max = Integer.MIN_VALUE;
        while(right < nums.length) {
            target -= nums[right++];

            while(target < 0)
                target += nums[left++];

            if(target == 0)
                max = Math.max(max, right - left);
        }

        return max == Integer.MIN_VALUE ? -1 : nums.length - max;
    }
}
