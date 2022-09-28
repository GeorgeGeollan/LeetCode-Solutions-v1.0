class Solution {
    public int getKthMagicNumber(int k) {
        int[] nums = new int[] {3, 5, 7};

        PriorityQueue<Long> queue = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();

        queue.add(1L);
        set.add(1L);

        while(!queue.isEmpty()) {
            long t = queue.poll();

            if(--k == 0)
                return (int) t;

            for(int num: nums) {
                if(!set.contains(num * t)) {
                    set.add(num * t);
                    queue.add(num * t);
                }
            }
        }

        return -1;
    }
}
