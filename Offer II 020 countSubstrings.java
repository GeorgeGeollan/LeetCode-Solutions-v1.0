class Solution1 {
    public int countSubstrings(String s) {
        int count = 0;

        System.out.println(s.substring(0, 1));
        int cur;

        for(int i = 0; i < s.length(); i++)
        {
            cur = i;

            while(cur < s.length())
            {
                if(isPalindrome(s.substring(i, cur + 1)))
                    count++;

                cur++;
            }
        }

        return count;
    }

    public boolean isPalindrome(String target)
    {
        int l = 0, r = target.length() - 1;
        char[] letter = target.toCharArray();

        while(l <= r)
        {
            if(letter[l] == letter[r])
            {
                l++;
                r--;
            }

            else
                return false;
        }

        return true;
    }
}

class Solution2 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;

        for(int j = 0; j < s.length(); j++)
        {
            for(int i = 0; i <= j; i++)
            {
                if(s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]))
                {
                    dp[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
