class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        int n = pref.length();

        for(String word: words) {
            if(word.length() < n) {
                continue;
            }

            if(word.substring(0, n).equals(pref)) {
                cnt++;
            }
        }

        return cnt;
    }
}
