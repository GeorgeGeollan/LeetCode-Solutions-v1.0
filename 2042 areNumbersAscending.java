class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = -1;

        for(int i = 0; i < words.length; i++) {
            if(Character.isDigit(words[i].charAt(0))) {
                if(prev >= Integer.valueOf(words[i])) {
                    return false;
                }
                
                prev = Integer.valueOf(words[i]);
            }
        }

        return true;
    }
}
