class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        Arrays.sort(trips, Comparator.comparingInt(o -> o[1]));

        for(int[] trip: trips) {
            capacity -= trip[0];

            if(capacity < 0) {
                while(!pq.isEmpty() && pq.peek()[2] <= trip[1])
                    capacity += pq.poll()[0];

                if(capacity < 0)
                    return false;
            }

            pq.add(trip);
        }

        return true;
    }
}
