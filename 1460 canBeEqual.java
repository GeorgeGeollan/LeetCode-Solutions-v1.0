class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt = new int[1001];

        for(int t: target) {
            cnt[t]++;
        }

        for(int a: arr) {
            cnt[a]--;

            if(cnt[a] < 0)
                return false;
        }

        return true;
    }
}
