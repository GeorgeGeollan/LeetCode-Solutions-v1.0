class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) {
            return new int[][]{newInterval};
        }

        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        boolean used = false;

        for(int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];

            if(a <= start && b <= end && b >= start) {
                start = a;
            }

            else if(start <= a && end <= b && end >= a) {
                end = b;
            }

            else if(end < a && !used) {
                ans.add(new int[] {start, end});
                ans.add(new int[] {a, b});
                used = true;

            }

            else if(start <= a && b <= end) {
                continue;
            }

            else if(a <= start && end <= b) {
                start = a;
                end = b;
            }

            else {
                ans.add(new int[] {a, b});
            }
        }

        if(!used) {
            ans.add(new int[] {start, end});
        }


        int[][] res = new int[ans.size()][2];

        for(int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
