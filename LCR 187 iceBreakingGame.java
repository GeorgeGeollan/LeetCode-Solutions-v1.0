class Solution {
    public int iceBreakingGame(int num, int target) {
        int p = 0;

        for(int i = 2; i <= num; i++) {
            p = (p + target) % i;
        }

        return p;
    }
}
