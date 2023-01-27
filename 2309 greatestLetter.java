class Solution {
    public String greatestLetter(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        for(char ch: s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                lower[ch - 'a']++;
            }

            else if(ch >= 'A' && ch <= 'Z') {
                upper[ch - 'A']++;
            }
        }

        for(int i = 25; i >= 0; i--) {
            if(lower[i] >= 1 && upper[i] >= 1) {
                char ans = (char)('A' + i);
                return "" + ans;
            }
        }

        return "";
    }
}
