class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;

        Arrays.sort(nums);
        for(int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        int[] ans = new int[m];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(nums[j] <= queries[i]) {
                    ans[i] = j + 1;
                }
            }
        }

        return ans;
    }
}
