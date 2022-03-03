class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int cnt = 0;
        for(int i = 2, prev = 0; i < nums.length; i++) {
            if(nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1])
                cnt += ++prev;
            else
                prev = 0;
        }
        
        return cnt;
    }
}
