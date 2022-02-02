class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            if(word.charAt(i) == ch) {
                sb.reverse();
                idx = i + 1;
                break;
            }
        }

        if(idx == 0)
            return sb.toString();

        for(int i = idx; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}
