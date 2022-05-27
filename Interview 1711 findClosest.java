class Solution {
    public int findClosest(String[] words, String word1, String word2) {
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int cnt = 0;

        for(int k = 0; k < words.length; k++) {
            
            if(words[k].equals(word1)) {
                i = k;
                cnt++;
            }
            
            if(words[k].equals(word2)) {
                j = k;
                cnt++;
            }

            if(cnt >= 2) {
                ans = Math.min(ans, Math.abs(i - j));
            }
                
        }

        return ans;
    }
}
