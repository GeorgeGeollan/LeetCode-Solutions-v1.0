class Solution {
    int mod = 1000000007;
    public int cuttingRope(int n) {
        if(n <= 3)
            return n - 1;
        long res = 1;

        while(n > 4) {
            res = res * 3 % mod;
            n = n - 3;
        }

        return (int)(res * n % mod);
    }
}
