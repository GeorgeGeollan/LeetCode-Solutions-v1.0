class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 1; i < heights.length; i++) {
            int dis = heights[i] - heights[i - 1];

            if(dis > 0) {
                pq.add(dis);
                bricks -= dis;

                if(bricks < 0) {
                    if(ladders > 0) {
                        ladders--;
                        bricks += pq.poll();
                    }

                    else
                        return i - 1;
                }
            }
        }

        return heights.length - 1;
    }
}
