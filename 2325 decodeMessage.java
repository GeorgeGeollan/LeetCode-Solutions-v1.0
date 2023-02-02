class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char cur = 'a';

        for(int i = 0; i < key.length(); i++) {
            if(key.charAt(i) == ' ') {
                continue;
            }

            if(map.containsKey(key.charAt(i))) {
                continue;
            }

            map.put(key.charAt(i), cur);
            cur = (char)(cur + 1);
        }

        String ans = "";

        for(int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') {
                ans += " ";
            }

            else {
                ans += map.get(message.charAt(i));
            }
        }

        return ans;
    }
}
