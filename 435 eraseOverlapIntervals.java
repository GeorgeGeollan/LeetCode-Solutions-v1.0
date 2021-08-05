class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 0 || intervals[0].length == 0)
            return 0;

        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int end = intervals[0][1];
        int count = 0;

        for(int i = 1; i < intervals.length; i++)
        {
            if(end > intervals[i][0])
            {
                count++;
                end = Math.min(end, intervals[i][1]);
            }

            else
                end = intervals[i][1];
        }

        return count;
    }
}
