class Solution1 {
    public int trailingZeroes(int n) {
        if(n == 0)
            return 0;

        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];

        dp1[0] = 0;
        dp2[0] = 0;
        for(int i = 1; i <= n; i++) {
            dp1[i] += dp1[i - 1];
            dp2[i] += dp2[i - 1];
            
            int n1 = i;
            int n2 = i;

            while(n1 > 0) {
                if(n1 % 2 == 0) {
                    dp1[i]++;
                    n1 = n1 / 2;
                }

                else
                    break;
            }
            

            while(n2 > 0) {
                if(n2 % 5 == 0) {
                    dp2[i]++;
                    n2 = n2 / 5;
                }

                else
                    break;
            }
            
        }

        return Math.min(dp1[n], dp2[n]);
    }
}

class Solution2 {
    public int trailingZeroes(int n) {
        int count = 0;

        while(n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}
