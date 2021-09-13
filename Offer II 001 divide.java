class Solution {
    public int divide(int a, int b) {
        if(a == 1 << 31 && b == -1)
            return (1 << 31) - 1;

        int res = 0;
        int a_abs = Math.abs(a), b_abs = Math.abs(b);
        for(int x = 31; x >= 0; x--)
        {
            if((a_abs >>> x) - b_abs >= 0)
            {
                res += 1 << x;
                a_abs -= b_abs << x;
            }
        }

        return (a > 0) == (b > 0) ? res : -res;
    }
}
