class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        for(int h: hand) {
            map.put(h, map.getOrDefault(h, 0) + 1);
            pq.add(h);
        }

        while(!pq.isEmpty()) {
            int t = pq.poll();

            if(map.get(t) == 0)
                continue;

            for(int i = 0; i < groupSize; i++) {
                int cnt = map.getOrDefault(i + t, 0);

                if(cnt == 0)
                    return false;

                map.put(t + i, cnt - 1);
            }
        }

        return true;
    }
}
