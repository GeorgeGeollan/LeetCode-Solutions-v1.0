class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        for(String startWord: startWords) {
            int mask = 0;

            for(char ch: startWord.toCharArray())
                mask |= 1 << (ch - 'a');

            set.add(mask);
        }

        for(String targetWord: targetWords) {
            int mask = 0;

            for(char ch: targetWord.toCharArray())
                mask |= 1 << (ch - 'a');

            for(char ch: targetWord.toCharArray()) {
                if(set.contains(mask ^ 1 << (ch - 'a'))) {
                    cnt++;
                    break;
                }
            }
        }

        return cnt;
    }
}
