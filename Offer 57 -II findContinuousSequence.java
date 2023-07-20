class Solution {
    public int[][] findContinuousSequence(int target) {
        int l = 1;
        int r = 2;
        List<int[]> ans = new ArrayList<>();
        int sum = 3;

        while(l < r) {
            if(sum == target) {
                int[] cur = new int[r - l + 1];

                for(int i = l; i <= r; i++) {
                    cur[i - l] = i;
                }

                ans.add(cur);
            }

            if(sum >= target) {
                sum -= l;
                l++;
            }

            else {
                r++;
                sum += r;
            }
        }

        return ans.toArray(new int[0][]);
    }
}
