class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] cnt = new int[210];
        for(int i: nums)
            cnt[i + 100]++;

        for(int i = -100; i < 0 && k > 0; i++) {
            while(cnt[i + 100] != 0 && k-- > 0) {
                cnt[i + 100]--;
                cnt[-i + 100]++;
            }
        }

        if(cnt[0 + 100] == 0 && k > 0 && k % 2 == 1) {
            int val = 1;

            while(cnt[val + 100] == 0)
                val++;

            cnt[val + 100]--;
            cnt[-val + 100]++;
        }

        int sum = 0;
        for(int i = -100; i <= 100; i++)
            sum += cnt[i + 100] * i;

        return sum;
    }
}
