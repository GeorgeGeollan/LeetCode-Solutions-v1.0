class Solution1 {
    public int maximumDifference(int[] nums) {
        int max = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                max = Math.max(max, nums[j] - nums[i]);
            }
        }

        return max == 0 ? -1 : max;
    }
}

class Solution2 {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int n = nums.length;

        for(int i = 0, min = nums[0]; i < n; i++) {
            if(nums[i] > min)
                ans = Math.max(ans, nums[i] - min);

            min = Math.min(nums[i], min);
        }

        return ans;
    }
}
