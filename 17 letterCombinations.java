class Solution1 {
    HashMap<String, String[]> map = new HashMap<>() {{
        put("2", new String[] {"a", "b", "c"});
        put("3", new String[] {"d", "e", "f"});
        put("4", new String[] {"g", "h", "i"});
        put("5", new String[] {"j", "k", "l"});
        put("6", new String[] {"m", "n", "o"});
        put("7", new String[] {"p", "q", "r", "s"});
        put("8", new String[] {"t", "u", "v"});
        put("9", new String[] {"w", "x", "y", "z"});

    }};
    
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        ArrayList<String> ans = new ArrayList<>();

        if(n == 0)
            return ans;

        StringBuilder sb = new StringBuilder();

        backtrack(digits, 0, n, sb, ans);

        return ans;
    }

    public void backtrack(String ds, int i, int n, StringBuilder sb, ArrayList<String> ans) {
        if(i == n) {
            ans.add(sb.toString());
            return;
        }

        String[] ls = map.get(ds.substring(i, i + 1));

        for(String l: ls) {
            sb.append(l);
            backtrack(ds, i + 1, n, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

class Solution2 {
    List<String> ans;
    HashMap<Character, String> map;
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        
        map = new HashMap<>();
        
        if(digits.length() == 0)
            return ans;
        
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        StringBuilder sb = new StringBuilder();
        dfs(digits, 0, sb);
        
        return ans;
    }
    
    public void dfs(String digits, int idx, StringBuilder sb) {
        if(idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }
            
        char cur = digits.charAt(idx);
        String com = map.get(cur);
        
        for(int i = 0; i < com.length(); i++) {
            sb.append(com.charAt(i));
            dfs(digits, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
