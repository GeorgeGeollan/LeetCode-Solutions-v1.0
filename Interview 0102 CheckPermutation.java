class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if(m != n || s1.equals(s2))
            return false;
        
        int[] cnt = new int[26];
        
        for(int i = 0; i < m; i++) {
            cnt[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < m; i++) {
            cnt[s2.charAt(i) - 'a']--;

            if(cnt[s2.charAt(i) - 'a'] < 0)
                return false;
        }

        return true;
    }
}
