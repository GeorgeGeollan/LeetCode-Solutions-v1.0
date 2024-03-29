class Solution {
    public int findRepeatNumber(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }

            if(nums[i] == nums[nums[i]]) {
                return nums[i];
            }

            int temp = nums[i];
            nums[i] = nums[nums[i]];
            nums[temp] = temp;
        }

        return -1;
    }
}
