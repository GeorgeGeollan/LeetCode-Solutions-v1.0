class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int ans = 0;

        for(char ch: s.toCharArray()) {
            if(ch == '|') {
                count++;
            }

            else if(count % 2 == 1) {
                continue;
            }

            else if(count % 2 == 0) {
                if(ch == '*')
                    ans++;
            }
        }

        return ans;
    }
}
