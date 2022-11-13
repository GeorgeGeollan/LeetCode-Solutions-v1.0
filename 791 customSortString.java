class Solution {
    public String customSortString(String order, String s) {
        int[] cnts = new int[26];
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()) {
            cnts[ch - 'a']++;
        }

        for(char ch: order.toCharArray()) {
            while(cnts[ch - 'a']-- > 0)
                sb.append(ch);
        }

        for(int i = 0; i < 26; i++) {
            while(cnts[i]-- > 0)
                sb.append((char)(i + 'a'));
        }

        return sb.toString();
    }
}
