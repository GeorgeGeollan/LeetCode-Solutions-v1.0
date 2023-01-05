class Solution1 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow = 1;
        
        int end = points[0][1];
        
        for(int i = 0; i < points.length; i++) {
            if(points[i][0] > end) {
                arrow++;
                end = points[i][1];
            }
        }
        
        return arrow;
    }
}

class Solution2 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) {
            return 0;
        }

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                if(p1[1] > p2[1]) {
                    return 1;
                }
                
                else if(p1[1] < p2[1]) {
                    return -1;
                }

                else {
                    return 0;
                }
            }
        });

        int pos = points[0][1];
        int ans = 1;

        for(int[] point: points) {
            if(point[0] > pos) {
                pos = point[1];
                ++ans;
            }
        }

        return ans;
    }
}
