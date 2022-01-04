class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            for(int j = i + 1, k = n - 1; j < k; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                while(k - 1 > j && nums[i] + nums[j] + nums[k - 1] >= 0)
                    k--;

                if(nums[i] + nums[j] + nums[k] == 0)
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
            }
        }

        return ans;
    }
}
