class Solution {
    String s;
    int n, k;
    public int maxConsecutiveAnswers(String answerKey, int k) {
        this.k = k;
        n = answerKey.length();
        s = answerKey;

        return Math.max(getCnt('T'), getCnt('F'));
    }

    int getCnt(char c) {
        int ans = 0;
        for(int i = 0, j = 0, cnt = 0; i < n; i++) {
            if(s.charAt(i) == c)
                cnt++;

            while(cnt > k) {
                if(s.charAt(j) == c)
                    cnt--;

                j++;
            }

            ans = Math.max(i - j + 1, ans);
        }

        return ans;
    }
}
