class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double ans = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int cur = cross(points[j][0] - points[i][0], points[j][1] - points[i][1], points[k][0] - points[i][0], points[k][1] - points[i][1]);
                    ans = Math.max(ans, Math.abs(cur / 2.0));
                }
            }
        }

        return ans;
    }

    public int cross(int a, int b, int c, int d) {
        return a * d - b * c;
    }
}
