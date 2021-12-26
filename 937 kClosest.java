class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((b, a) -> (a[0] - 0) * (a[0] - 0) + (a[1] - 0) * (a[1] - 0) - (b[0] - 0) * (b[0] - 0) - (b[1] - 0) * (b[1] - 0));
        
        
        for(int[] point: points) {
            pq.add(point);
            
            if(pq.size() > k)
                pq.poll();
        }
        
        System.out.println(pq.size());
        int[][] res = new int[pq.size()][2];
        
        for(int i = 0; i < res.length; i++)
            res[i] = pq.poll();
        
        return res;
    }
}
