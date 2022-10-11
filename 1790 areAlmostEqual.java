class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int cnt = 0;
        int[] cnt2 = new int[26];

        for(int i = 0; i < n; i++) {
            cnt2[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++) {
            cnt2[s2.charAt(i) - 'a']--;

            if(cnt2[s2.charAt(i) - 'a'] < 0)
                return false;
        }

        for(int i = 0; i < n; i++) {
            if(s1.charAt(i) == s2.charAt(i))
                continue;

            else
                cnt++;
        }

        return cnt == 2 || cnt == 0;
    }
}
