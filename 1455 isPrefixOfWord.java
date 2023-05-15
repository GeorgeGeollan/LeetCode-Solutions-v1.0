class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int n = searchWord.length();

        for(int i = 0; i < words.length; i++) {
            int m = words[i].length();
            
            if(m < n) {
                continue;
            }
                
            
            if(words[i].substring(0, n).equals(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}
