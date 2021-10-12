class Solution {
    int INF = Integer.MAX_VALUE;
    public int divide(int dividend, int divisor) 
    {
        long a = dividend, b = divisor;
        boolean flag = false;
        
        if((a < 0 && b > 0) || (a > 0 && b < 0))
            flag = true;

        if(a < 0)
            a = -a;

        if(b < 0)
            b = -b;


        long l = 0, r = a;

        while(l < r)
        {
            long mid = (l + r + 1) >> 1;

            if(mul(mid, b) <= a)
                l = mid;
            
            else 
                r = mid - 1;
        }

        r = flag ? -r : r;

        if(r  > INF || r < -INF - 1)
            return INF;

        return (int)r;

    }

    public long mul(long mid, long divisor)
    {
        long ans = 0;

        while(divisor > 0)
        {
            if((divisor & 1) == 1)
                ans += mid;

            divisor >>= 1;
            mid += mid;
        }

        return ans;
    }
}
