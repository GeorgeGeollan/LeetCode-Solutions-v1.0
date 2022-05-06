class RecentCounter {
    int[] time = new int[10009];
    int cnt;
    int ptr;
    int minneed;
    public RecentCounter() {
        ptr = 0;
        cnt = 0;
        minneed = 0;
    }
    
    public int ping(int t) {
        time[ptr++] = t;
        int left = t - 3000;
        int right = t;
        
        while(time[minneed] < left) {
            minneed++;
            System.out.println(left);
        }
            

        return ptr - minneed;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
