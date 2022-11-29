
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int cnt = 0;
        int minVal = n;
        char prev = s.charAt(0);

        for(int i = 1; i < n; i++) {
            if(prev == s.charAt(i)) {
                if(s.charAt(i) == '1') {
                    prev = '0';
                }

                else
                    prev = '1';

                cnt++;
            }

            else
                prev = s.charAt(i);
        }


        return Math.min(n - cnt, cnt);

    }
}
