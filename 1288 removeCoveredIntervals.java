class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);

        int max = -1;
        int n = intervals.length;
        int cnt = n;

        for(int i = 0; i < n; i++) {
            if(intervals[i][1] <= max)
                cnt--;

            max = Math.max(max, intervals[i][1]);
        }

        return cnt;
    }
}
