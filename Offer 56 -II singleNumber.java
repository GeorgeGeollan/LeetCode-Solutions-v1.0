class Solution {
    public int singleNumber(int[] nums) {
        int[] bits = new int[32];

        for(int num: nums) {
            for(int i = 0; i < 32; i++) {
                bits[i] += num & 1;
                num >>>= 1;
            }
        }

        int ans = 0, m = 3;

        for(int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= bits[31 - i] % m;
        }

        return ans;
    }
}
