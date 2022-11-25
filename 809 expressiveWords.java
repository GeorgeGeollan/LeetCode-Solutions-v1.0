class Solution {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;

        for(String word: words) {
            if(check(s, word))
                ++ans;
        }

        return ans;
    }

    public boolean check(String s, String t) {
        int m = s.length(), n = t.length();

        if(n > m)
            return false;

        int i = 0, j = 0;

        while(i < m && j < n) {
            if(s.charAt(i) != t.charAt(j))
                return false;

            int k = i;

            while(k < m && s.charAt(i) == s.charAt(k))
                ++k;

            int c1 = k - i;
            i = k;
            k = j;

            while(k < n && t.charAt(j) == t.charAt(k))
                ++k;

            int c2 = k - j;
            j = k;

            if(c1 < c2 || (c1 < 3 && c1 != c2))
                return false;
        }

        return i == m && j == n;
    }
}
