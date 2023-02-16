class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];

        for(int num: nums) {
            cnt[num]++;
        }

        int pairs = 0, res = 0;

        for(int i = 0; i <= 100; i++) {
            pairs = pairs + cnt[i] / 2;
            res = res + cnt[i] % 2;
        }

        return new int[] {pairs, res};
    }
}
