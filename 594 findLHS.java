class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0, n = nums.length;

        for(int i = 0, j = 0; j < n; j++) {
            while(i < j && nums[j] - nums[i] > 1)
                i++;

            if(nums[j] - nums[i] == 1)
                res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
