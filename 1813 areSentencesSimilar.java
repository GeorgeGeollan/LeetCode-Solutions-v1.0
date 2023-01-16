class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        
        int m = words1.length;
        int n = words2.length;
        int i = 0, j = 0;

        while(i < m && i < n && words1[i].equals(words2[i])) {
            i++;
        }

        while (j < m - i && j < n - i && words1[m - j - 1].equals(words2[n - j - 1])) {
            j++;
        }

        return i + j == Math.min(m, n);
    }
}
