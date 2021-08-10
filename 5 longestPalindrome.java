class Solution1 {
    public String longestPalindrome(String s) {
        int n = s.length();

        if(n < 2)
            return s;

        boolean[][] dp = new boolean[n][n];
        String res = "";

        for(int i = 1; i < n; i++)
        {
            for(int j = i; j >= 0; j--)
            {
                dp[j][i] = s.charAt(i) == s.charAt(j) && (i - j < 3 || dp[j + 1][i - 1]);

                if(dp[j][i] && (res == null || res.length() == 0 || i - j + 1 > res.length()))
                    res = s.substring(j, i + 1);
            }
        }

        return res;
    }
}

class Solution2 {
    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if(len > end - start)
            {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right)
    {
        while(left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right)))
        {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
