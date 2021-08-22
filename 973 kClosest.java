class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((p0, p1) -> p1[0] * p1[0] + p1[1] * p1[1] - p0[0] * p0[0] - p0[1] * p0[1]);
        int[][] res = new int[k][2];

        for(int[] point: points)
        {
            pq.offer(point);

            if(pq.size() > k)
                pq.poll();
        }

        while(k > 0)
        {
            res[--k] = pq.poll();
        }

        return res;
    }
}
