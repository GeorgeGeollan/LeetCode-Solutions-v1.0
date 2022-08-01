class Solution {
    public String generateTheString(int n) {
        String ans = "";

        int cnt = 0;
        if(n % 2 == 0) {
            cnt = 1;
            n = n - 1;
        }

        for(int i = 0; i < n; i++)
            ans += "a";

        for(int i = 0; i < cnt; i++)
            ans += "b";

        return ans;
    }
}
