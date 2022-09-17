class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] idx = new int[26];
        int ans = -1;
        Arrays.fill(idx, 310);

        for(int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';

            idx[u] = Math.min(idx[u], i);
            ans = Math.max(ans, i - idx[u] - 1);
        }

        return ans;
    }
}
