class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        int lcm = a * b / (a < b ? gcd(b, a) : gcd(a, b));
        long mod = 1000000007;
        long left = 0, right = Long.MAX_VALUE;

        while(left < right) {
            long mid = left + (right - left) / 2;
            if(mid / a + mid / b - mid / lcm < n)
                left = mid + 1;
            else
                right = mid;
        }

        return (int)(left % mod);
    }

    public int gcd(int a, int b) {
        if(b == 0)
            return a;

        else
            return gcd(b, a % b);
    }
}
