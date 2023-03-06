class Solution {
    public int minimumDeletions(String s) {
        int leftb = 0, righta = 0;

        for(char ch: s.toCharArray()) {
            if(ch == 'a') {
                righta++;
            }
        }

        int res = righta;

        for(char ch: s.toCharArray()) {
            if(ch == 'a') {
                righta--;
            }

            else {
                leftb++;
            }

            res = Math.min(res, righta + leftb);
        }

        return res;
    }
}
