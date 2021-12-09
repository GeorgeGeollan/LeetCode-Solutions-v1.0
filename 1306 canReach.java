class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int n = arr.length;

        queue.add(start);
        set.add(start);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            int idx1 = cur - arr[cur];
            int idx2 = cur + arr[cur];

            if(idx1 < n && idx1 >= 0) {
                if(arr[idx1] == 0)
                    return true;

                if(set.add(idx1)) {
                    queue.add(idx1);
                }
            }

            if(idx2 < n && idx2 >= 0) {
                if(arr[idx2] == 0)
                    return true;

                if(set.add(idx2)) {
                    queue.add(idx2);
                }
            }
        }

        return false;
    }
}
