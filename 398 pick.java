class Solution {
    Random random = new Random();
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        int n = nums.length, ans = 0;
        for(int i = 0, cnt = 0; i < n; i++) {
            if(nums[i] == target) {
                cnt++;

                if(random.nextInt(cnt) == 0)
                    ans = i;
            }
        }

        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
