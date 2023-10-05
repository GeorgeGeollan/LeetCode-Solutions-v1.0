class Solution {
    public int cuttingBamboo(int bamboo_len) {
        int cnt = bamboo_len / 3;
        int b = bamboo_len % 3;
        int mod = 1000000007;
        long ans = 1;

        if(bamboo_len <= 3) {
            return bamboo_len - 1;
        }

        for(int i = 1; i < cnt; i++) {
            ans = ans * 3 % mod;
        }

        if(b == 0) {
            return (int)(ans * 3 % mod);
        }

        if(b == 1) {
            return (int)(ans * 4 % mod);
        }

        return (int)(ans * 6 % mod);
    }
}
