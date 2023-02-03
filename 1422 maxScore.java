class Solution {
    public int maxScore(String s) {
        int total = s.length();
        int cnt_0 = 0;
        int max = 0;
        int dp[] = new int[total];

        for(int i = 0; i < total; i++) {
            if(s.charAt(i) == '0')
                cnt_0++;

            dp[i] = cnt_0;
        }

        for(int i = 0; i < total - 1; i++) {
            int a = dp[i];
            int b = dp[total - 1] - a;

            int len = total - i - 1;
            max = Math.max(max, a + len - b);
        }

        return max;
    }
}
