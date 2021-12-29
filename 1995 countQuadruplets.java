class Solution1 {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int a = 0; a < n; a++) {
            for(int b = a + 1; b < n; b++) {
                for(int c = b + 1; c < n; c++) {
                    for(int d = c + 1; d < n; d++) {
                        if(nums[a] + nums[b] + nums[c] == nums[d])
                            count++;
                    }
                }
            }
        }

        return count;
    }
}

class Solution2 {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] cnt = new int[10010];

        for(int c = n - 2; c >= 2; c--) {
            cnt[nums[c + 1]]++;

            for(int a = 0; a < n; a++) {
                for(int b = a + 1; b < c; b++) {
                    ans += cnt[nums[a] + nums[b] + nums[c]];
                } 
            }
        }

        return ans;
    }
}
