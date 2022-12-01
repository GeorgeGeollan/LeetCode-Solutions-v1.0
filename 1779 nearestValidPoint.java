
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minPos = -1;

        int minVal = Integer.MAX_VALUE;

        for(int i = 0; i < points.length; i++) {
            if(points[i][0] != x && points[i][1] != y)
                continue;

            else {
                int dis = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);

                if(dis < minVal) {
                    minVal = dis;
                    minPos = i;
                }
            }
        }

        return minPos;
    }
}
