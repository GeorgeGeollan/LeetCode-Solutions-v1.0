class Solution {
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
