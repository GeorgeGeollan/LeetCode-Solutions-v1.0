class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n = rectangles.length;
        int[] max = new int[n];
        int m = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
             max[i] = Math.min(rectangles[i][0], rectangles[i][1]);

             if(m < max[i]) {
                 m = max[i];
                 cnt = 0;
             }

             if(m == max[i])
                cnt++;
        }

        return cnt;
    }
}
