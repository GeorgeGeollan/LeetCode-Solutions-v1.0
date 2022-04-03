class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] cnt = new int[26];

        for(int i = 0; i < letters.length; i++) {
            cnt[letters[i] - 'a']++;
        }

        int start = (target - 'a' + 1) % 26;
        char res = ' ';

        while(true) {
            if(cnt[start] > 0) {
                res = (char)('a' + start);
                break;
            }

            start = (start + 1) % 26;
        }

        return res;
    }
}
