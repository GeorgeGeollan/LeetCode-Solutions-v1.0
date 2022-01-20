class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];
        for(int stone: stones)
            cnt[stone % 3]++;

        return cnt[0] % 2 == 0 ? !(cnt[1] == 0 || cnt[2] == 0) : Math.abs(cnt[2] - cnt[1]) > 2;
    }
}
