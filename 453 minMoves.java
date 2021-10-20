class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        int sum = 0;

        for(int i = 1; i < nums.length; i++)
            sum += nums[i] - first;

        return sum;

    }
}
