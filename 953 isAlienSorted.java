class Solution {
    int[] cnt = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        char[] ch = order.toCharArray();

        for(int i = 0; i < 26; i++) {
            cnt[ch[i] - 'a'] = i;
        }

        for(int i = 1; i < words.length; i++) {
            if(check(words[i - 1], words[i]) > 0)
                return false;
        }

        return true;
    }


    public int check(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();

        int i = 0, j = 0;

        while(i < m && j < n) {
            int c1 = w1.charAt(i) -'a', c2 = w2.charAt(j) - 'a';
            if(c1 != c2)
                return cnt[c1] - cnt[c2];

            i++;
            j++;
        }

        if(i < m)
            return 1;

        if(j < n)
            return -1;

        return 0;
    }
}
