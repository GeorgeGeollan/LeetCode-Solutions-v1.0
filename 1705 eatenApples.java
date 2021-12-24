class Solution {
    public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n = apples.length, time = 0, ans = 0;

        while(time < n || !pq.isEmpty()) {
            if(time < n && apples[time] > 0)
                pq.add(new int[] {time + days[time] - 1, apples[time]});

            while(!pq.isEmpty() && pq.peek()[0] < time)
                pq.poll();
            
            if(!pq.isEmpty()) {
                int[] cur = pq.poll();
                if(--cur[1] > 0 && cur[0] > time)
                    pq.add(cur);
                
                ans++;
            }

            time++;
        }

        return ans;
    }
}
