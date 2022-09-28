class Solution {
    public boolean oneEditAway(String first, String second) {
        int i = 0, j = 0;
        int n = first.length();
        int m = second.length();
        int cnt = 0;

        if(Math.abs(m - n) > 1)
            return false;

        if(n > m)
            return oneEditAway(second, first);

        while(i < n && j < m && cnt <= 1) {
            char ch1 = first.charAt(i), ch2 = second.charAt(j);

            if(ch1 == ch2) {
                i++;
                j++;
            }

            else {
                if(n == m) {
                    i++;
                    j++;
                    cnt++;
                }

                else {
                    j++;
                    cnt++;
                }
            }
        }

        return cnt <= 1;
    }
}
