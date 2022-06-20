class Solution {
    public int minimumLengthEncoding(String[] words) {
        int n = words.length;

        String[] reverse = new String[n];

        for(int i = 0; i < n; i++) {
            String word = words[i];

            String rword = new StringBuilder(word).reverse().toString();
            reverse[i] = rword;
        }

        Arrays.sort(reverse);

        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(i + 1 < n && reverse[i + 1].startsWith(reverse[i])) {

            }

            else {
                ans += reverse[i].length() + 1;
            }
        }

        return ans;
    }
}
