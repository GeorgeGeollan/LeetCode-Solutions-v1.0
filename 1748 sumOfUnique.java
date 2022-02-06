class Solution {
    public int sumOfUnique(int[] nums) {
        int[] cnt = new int[101];

        for(int i = 0; i < nums.length; i++)
            cnt[nums[i]]++;

        int ans = 0;
        for(int i = 0; i <= 100; i++) {
            if(cnt[i] == 1)
                ans += i;
        }

        return ans;
    }
}
