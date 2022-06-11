class Solution1 {
    public int minFlipsMonoIncr(String s) {
        int f0 = 0, f1 = 0;

        for(int i = 0; i < s.length(); i++)
        {
            f0 += s.charAt(i) - '0';
            f1 = Math.min(f0, f1 + 1 - (s.charAt(i) - '0'));
        }

        return f1;
    }
}

class Solution2 {
    public int minFlipsMonoIncr(String s) {
        char[] cs = s.toCharArray();

        int n = cs.length, ans = n;
        int[] sum = new int[n +10];

        for(int i = 1; i <= n; i++)
            sum[i] = sum[i - 1] + (cs[i - 1] - '0');

        for(int i = 1; i <= n; i++) {
            int l = sum[i - 1], r = (n - i) - (sum[n] - sum[i]);
            ans = Math.min(ans, l + r);
        }

        return ans;
    }
}
