class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);

        // return length;
        
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= s.length(); i++)
        {
            String sub = s.substring(i - 2, i);
            dp[i] = sub.compareTo("10") >= 0 && sub.compareTo("25") <= 0 ? dp[i - 1] + dp[i - 2] : dp[i - 1];
            // dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[s.length()];
    }
}
