class Solution {
    public boolean buddyStrings(String s, String goal) {
        int m = s.length(), n = goal.length();

        if(m != n)
            return false;

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        boolean ok = false;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int a = s.charAt(i) - 'a', b = goal.charAt(i) - 'a';
            cnt1[a]++;
            cnt2[b]++;

            if(a != b)
                sum++;
        }

        for(int i = 0; i < 26; i++) {
            if(cnt1[i] != cnt2[i])
                return false;

            if(cnt1[i] > 1)
                ok = true;
        }

        return sum == 2 || (ok && sum == 0);
    }
}
