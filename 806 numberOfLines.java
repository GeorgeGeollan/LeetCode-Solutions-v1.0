class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int cnt = 1;
        int[] ans = new int[2];

        for(int i = 0; i < s.length(); i++) {
            if(sum + widths[s.charAt(i) - 'a'] > 100) {
                cnt++;
                sum = 0;
            }

            sum += widths[s.charAt(i) - 'a'];
        }

        ans[0] = cnt;
        ans[1] = sum;

        return ans;
    }
}
