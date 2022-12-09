class Solution {
    public boolean checkPowersOfThree(int n) {
        int[] dict = new int[15];
        int pre = 1;

        for(int i = 0; i < 15; i++) {
            dict[i] = pre;
            pre = pre * 3;
        }

        for(int i = 14; i >= 0; i--) {
            if(dict[i] > n) {
                continue;
            }

            else {
                n = n - dict[i];
            }
        }

        return n == 0;
    }
}
