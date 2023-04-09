class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] cnt = new int[26];

        Arrays.fill(cnt, -1);


        for(int i = 0; i < s.length(); i++) {
            if(cnt[s.charAt(i) - 'a'] == -1) {
                cnt[s.charAt(i) - 'a'] = i;
            }

            else {
                cnt[s.charAt(i) - 'a'] = i - cnt[s.charAt(i) - 'a'] - 1;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(cnt[i] == distance[i]) {
                continue;
            }

            if(cnt[i] == -1) {
                continue;
            }

            else {
                return false;
            }
        }

        return true;

    }
}
