class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];

        int diff = max - min;

        if(diff >= 0 && diff - 2 * k <= 0)
            return 0;

        else
            return diff - 2 * k;
    }
}
