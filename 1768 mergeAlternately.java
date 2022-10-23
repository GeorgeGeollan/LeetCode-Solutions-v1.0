class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length();
        int n = word2.length();

        for(int i = 0, j = 0; i < word1.length() || j < word2.length();) {
            if(i < m) {
                sb.append(word1.charAt(i));
                i++;
            }

            if(j < n) {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }
}
