class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] cnt = new int[26];
        int ans = 0;

        for(char ch: allowed.toCharArray()) {
            cnt[ch - 'a']++;
        }

        for(String word: words) {
            for(int i = 0; i < word.length(); i++) {
                if(cnt[word.charAt(i) - 'a'] != 1)
                    break;

                else if(i == word.length() - 1 && cnt[word.charAt(i) - 'a'] == 1)
                    ans++;
            }
        }

        return ans;
    }
}
