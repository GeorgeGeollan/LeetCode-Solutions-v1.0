class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] cnt = new int[10001];
        int ans = 0;

        for(int a: arr) {
            cnt[a]++;
        }

        for(int i = 1; i <= 10000; i++) {
            if(cnt[i] == 0) {
                ans++;
            }

            if(ans == k) {
                return i;
            }
        }

        return -1;
    }
}
