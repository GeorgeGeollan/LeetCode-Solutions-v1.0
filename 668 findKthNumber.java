class Solution {
    public boolean enough(int x, int m, int n, int k) {
        int count = 0;
        for(int i = 1; i <= m; i++) {
            count += Math.min(x / i, n);
        }

        return count >= k;
    }

    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = n * m;

        while(l < r) {
            int mid = l + (r - l) / 2;

            if(!enough(mid, m, n, k))
                l = mid + 1;

            else
                r = mid;
        }

        return l;
    }
}
