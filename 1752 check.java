
class Solution {
    public boolean check(int[] nums) {
        boolean flag = true;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] <= nums[i + 1])
                continue;

            flag = false;

            while(i < nums.length - 2 && nums[i + 1] <= nums[i + 2]) {
                i++;
            }

            if(i != nums.length - 2)
                return false;
        }

        return flag || nums[0] >= nums[nums.length - 1];
    }
}
