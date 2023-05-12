class Solution {
    public char firstUniqChar(String s) {
        int[] cnt = new int[26];

        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(cnt[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return ' ';
    }
}
