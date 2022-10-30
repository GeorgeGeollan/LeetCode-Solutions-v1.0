class Solution {
    public List<String> letterCasePermutation(String str) {
        List<String> ans = new ArrayList<String>();
        int n = str.length(), m = 0;
        for (int i = 0; i < n; i++) m += Character.isLetter(str.charAt(i)) ? 1 : 0;
        for (int s = 0; s < (1 << m); s++) {
            char[] cs = str.toCharArray();
            for (int i = 0, j = 0; i < n; i++) {
                if (!Character.isLetter(cs[i])) continue;
                cs[i] = ((s >> j) & 1) == 1 ? (char) (cs[i] ^ 32) : cs[i];
                j++;
            }
            ans.add(String.valueOf(cs));
        }
        return ans;
    }
}
