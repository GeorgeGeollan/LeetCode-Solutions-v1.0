class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        int cur = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++)
            sum += nums[i];

        for(int i = nums.length - 1; i >= 0; i--) {
            cur += nums[i];
            sum -= nums[i];
            ans.add(nums[i]);
            if(cur > sum)
                break;
        }

        return ans;
    }
}
