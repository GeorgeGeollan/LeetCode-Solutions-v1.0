class Solution {
    public int minSwaps(int[] nums) {
        int min = 0, cnt = 0;

        for(int num: nums)
            cnt += num;

        for(int i = 0; i < cnt; i++)
            min += 1 - nums[i];

        for(int i = 0, j = min; i < nums.length; i++)
            min = Math.min(min, j += nums[i] - nums[(i + cnt) % nums.length]);

        return min;
    }
}
