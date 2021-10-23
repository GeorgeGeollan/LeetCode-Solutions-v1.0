class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];

        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] > nums[i + 1])
                return nums[i + 1];

            else if(nums[i] == nums[i + 1]) {
                continue;
            }

            else {
                min = nums[i];
            }
        }

        return min;
    }
}
