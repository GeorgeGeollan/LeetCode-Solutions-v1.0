class Solution {
    static int MOD = (int)(1e9 + 7);
    public int numPrimeArrangements(int n) {
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if(isPrime(i))
                cnt++;
        }

        int a = cnt;
        int b = n - cnt;
            
        return (int)(factorial(a) * factorial(b) % MOD);
    }

    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            res %= MOD;
        }
        return res;
    }

}
