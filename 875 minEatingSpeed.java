class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1_000_000_000;

        while(l < r) {
            int m = (l + r) / 2;
            if(!possible(piles, h, m))
                l = m + 1;

            else
                r = m;
        }

        return l;

    }

    public boolean possible(int[] piles, int h, int k) {
        int t = 0;
        for(int pile: piles)
            t += (pile - 1) / k + 1;

        return t <= h;
    }
}
