class Solution1 {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(Math.abs(nums[i] - nums[j]) == k)
                    ans++;
            }
        }

        return ans;
    }
}

class Solution2 {
    public int countKDifference(int[] nums, int k) {
        int[] cnt = new int[101];
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if(t - k >= 1)
                ans += cnt[t - k];
            
            if(t + k <= 100)
                ans += cnt[t + k];

            cnt[t]++;
        }

        return ans;
    }
}
