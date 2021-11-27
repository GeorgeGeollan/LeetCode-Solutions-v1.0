class Solution {
    int m, n, cnt;
    Map<Integer, Integer> map = new HashMap<>();
    Random random = new Random(300);
    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        this.cnt = m * n;
        
    }
    
    public int[] flip() {
        int x = random.nextInt(cnt--);
        int idx = map.getOrDefault(x, x);
        map.put(x, map.getOrDefault(cnt, cnt));
        return new int[] {idx / n, idx % n};
    }
    
    public void reset() {
        cnt = m * n;
        map.clear();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
