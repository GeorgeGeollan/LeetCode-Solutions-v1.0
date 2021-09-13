class Solution1 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        int count = 0;

        for(int i = 0; i <= n; i++)
        {
            int divide = i;
            while(divide > 0)
            {
                if(divide % 2 == 1)
                    count++;
                
                divide = divide / 2;
            }

            res[i] = count;
            count = 0;
        }

        return res;
    }
}

class Solution2 {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];

        for(int i = 1; i <= n; i++)
            dp[i] = dp[i >> 1] + (i & 1);

        return dp;
    }
}
