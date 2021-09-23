class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] charCount = new int[26];

        for(char ch : s1.toCharArray())
            charCount[ch - 'a']++;

        int l = 0, r = 0;

        while(l <= s2.length() - s1.length())
        {
            while(r < l + s1.length() && charCount[s2.charAt(r) - 'a'] >= 1)
            {
                charCount[s2.charAt(r) - 'a']--;
                r++;
            }

            if(r == l + s1.length())
                return true;

            charCount[s2.charAt(l) - 'a']++;
            l++;
        }

        return false;
    }
}
