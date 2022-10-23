class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int[] cnt = new int[n + 1];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            cnt[nums[i]]++;
            if(cnt[nums[i]] == 2) {
                ans = nums[i];
            }

            sum += nums[i];
        }

        int total = (n + 1) * n / 2;
        
        int left = total + ans - sum;

        return new int[] {ans, left};
    }
}
