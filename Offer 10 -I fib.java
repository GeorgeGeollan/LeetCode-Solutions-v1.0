class Solution1 {
    public int fib(int n) {
        if(n < 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;

        return dp[n];
    }
}

class Solution2 {
    public int fib(int n) {
        int a = 0, b = 1, sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;
    }
}
