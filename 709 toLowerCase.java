class Solution {
    public String toLowerCase(String s) {
        char[] words = s.toCharArray();
        int n = words.length;

        for(int i = 0; i < n; i++) {
            if(words[i] >= 'A' && words[i] <= 'Z')
                words[i] = (char)(words[i] + 32);
        }

        return new String(words);
    }
}
