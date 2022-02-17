class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int idx = s.length - 1;
        int cnt = 0;

        for(int i = g.length - 1; i >= 0; i--) {
            if(idx >= 0 && g[i] <= s[idx]) {
                cnt++;
                idx--;
            }

        }

        return cnt;
    }
}
