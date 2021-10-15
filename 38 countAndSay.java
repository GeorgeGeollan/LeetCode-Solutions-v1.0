class Solution {
    public String countAndSay(int n) {
        String ans = "1";

        for(int i = 2; i <= n; i++)
        {
            int len = ans.length();
            String cur = "";

            for(int j = 0; j < len; )
            {
                int k = j + 1;

                while(k < len && ans.charAt(j) == ans.charAt(k))
                    k++;
                cur += (k - j) + "" + ans.charAt(j);

                j = k;
            }

            ans = cur;
        }

        return ans;
    }
}
