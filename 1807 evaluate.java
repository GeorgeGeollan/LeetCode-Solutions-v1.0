class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        String res = "";

        for(List<String> k: knowledge) {
            String cur = "(" + k.get(0) + ")";

            map.put(cur, k.get(1));
        }

        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                String ans = "";
                while(s.charAt(i) != ')') {
                    ans += s.charAt(i);
                    i++;
                }

                ans += ")";
                String cur = map.getOrDefault(ans, "?");
                res += cur;
            }

            else if(i < s.length()) {
                res += s.charAt(i);
            }
        }

        return res;
    }
}
