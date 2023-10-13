class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int idx = 1, n = nums.length;

        for(int i = 1; i < n; i++) {
            if(nums[i] != prev) {
                nums[idx++] = nums[i];
                prev = nums[i];
            }
        }
        
        return idx;
    }
}
