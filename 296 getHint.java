class Solution {
    public String getHint(String secret, String guess) {
        int count = 0;
        int equal = 0;
        int[] res = new int[10];
        int m = secret.length(), n = guess.length();

        for(int i = 0; i < m; i++)
            res[secret.charAt(i) - '0']++;

        for(int i = 0; i < n; i++) {
            if(res[guess.charAt(i) - '0'] > 0) {
                count++;
                res[guess.charAt(i) - '0']--;
            }
        }

        for(int i = 0; i < m; i++) {
            if(secret.charAt(i) == guess.charAt(i))
                equal++;
        }

        return "" + equal + "A" + (count - equal) + "B";
    }
}
