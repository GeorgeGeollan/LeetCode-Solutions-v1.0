class Solution1 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int n: position) {
            if(n % 2 == 0)
                odd++;
            
            if(n % 2 == 1)
                even++;
        }

        return Math.min(odd, even);
    }
}

class Solution2 {
    public int minCostToMoveChips(int[] position) {
        int[] cnt = new int[2];

        for(int p: position) {
            cnt[p % 2]++;
        }

        return Math.min(cnt[0], cnt[1]);
    }
}
