class Solution {
    int n, len, max;
    Set<String> set = new HashSet<>();
    String _s;
    public List<String> removeInvalidParentheses(String s) {
        _s = s;
        n = s.length();

        int l = 0, r = 0;
        
        for(char ch : s.toCharArray()) {
            if(ch == '(')
                l++;
            
            else if(ch == ')')
                r++;
        }

        max = Math.min(l, r);

        dfs(0, "", 0);

        return new ArrayList<>(set);
    }

    public void dfs(int ptr, String cur, int score) {
        if(score < 0 || score > max)
            return;

        if(ptr == n) {
            if(score == 0 && cur.length() >= len) {
                if(cur.length() > len)
                    set.clear();
                len = cur.length();
                set.add(cur);
            }

            return;
        }

        char c = _s.charAt(ptr);

        if(c == '(') {
            dfs(ptr + 1, cur, score);
            dfs(ptr + 1, cur + _s.valueOf(c), score + 1);
        }

        else if(c == ')') {
            dfs(ptr + 1, cur, score);
            dfs(ptr + 1, cur + _s.valueOf(c), score - 1);
        }

        else {
            dfs(ptr + 1, cur + _s.valueOf(c), score);
        }
    }
}
