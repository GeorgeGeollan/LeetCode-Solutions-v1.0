class Solution1 {
    public int[] countBits(int n) {
        int[] cnt = new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            cnt[i] = cnt[i & (i - 1)] + 1;
        }
        
        return cnt;
    }
}

class Solution2 {
    public int[] countBits(int n) {
        int[] cnt = new int[n + 1];
        
        for(int i = 0; i <= n; i++) {
            cnt[i] = cnt[i >> 1] + (i & 1);
        }
        
        return cnt;
    }
}
