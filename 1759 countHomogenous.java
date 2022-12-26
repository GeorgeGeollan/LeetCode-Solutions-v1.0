class Solution {
    public int countHomogenous(String s) {
        final int mod = 1000000007;
        long ans = 0;
        char prev = s.charAt(0);
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == prev) {
                cnt++;
            }

            else {
                ans += (long) cnt * (cnt + 1) / 2;
                prev = c;
                cnt = 1;
            }
        }

        ans += (long) cnt * (cnt + 1) / 2;

        return (int) (ans % mod);
    }
}
