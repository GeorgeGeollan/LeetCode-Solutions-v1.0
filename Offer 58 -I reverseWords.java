class Solution {
    public String reverseWords(String s) {
        int n = 0;
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for(int i = words.length - 1; i >= 0; i--) {
            if(words[i].length() == 0) {
                continue;
            }

            sb.append(words[i]);

            if(i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}
