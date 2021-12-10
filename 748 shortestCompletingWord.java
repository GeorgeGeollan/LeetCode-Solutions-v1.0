class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] cnt = getCnt(licensePlate);
        String ans = null;


        for(String word: words) {
            int[] cur = getCnt(word);

            boolean ok = true;

            for(int i = 0; i < 26 && ok; i++) {
                if(cnt[i] > cur[i])
                    ok = false;
            }

            if(ok && (ans == null || ans.length() > word.length()))
                ans = word;
        }

        return ans;
        
    }
    
    public int[] getCnt(String s) {
        int[] cnt = new int[26];

        for(char ch: s.toCharArray()) {
            if(Character.isLetter(ch))
                cnt[Character.toLowerCase(ch) - 'a']++;
        }

        return cnt;
    }
}
