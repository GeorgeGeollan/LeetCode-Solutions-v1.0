class Solution {
    public int longestStrChain(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        Arrays.sort(words, (a, b) -> (a.length() - b.length()));

        int minV = words[0].length(), maxV = 1;

        for(String word: words) {
            int m = word.length();

            int len = 1;

            if(m > minV) {
                for(int i = 0; i < m; i++) {
                    String concat = word.substring(0, i) + word.substring(i + 1);

                    len = Math.max(len, map.getOrDefault(concat, 0) + 1);
                }
            }

            maxV = Math.max(maxV, len);
            map.put(word, len);
        }

        return maxV;
    }
}
