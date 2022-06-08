class Solution {
    public boolean isBoomerang(int[][] points) {
        int[] p1 = points[0];
        int[] p2 = points[1];
        int[] p3 = points[2];

        if((p1[0] == p2[0] && p1[1] == p2[1]) || (p1[0] == p3[0] && p1[1] == p3[1]) || (p3[0] == p2[0] && p3[1] == p2[1]) || (p1[0] == p2[0] && p3[0] == p2[0]) || (p1[1] == p2[1] && p3[1] == p2[1]))
            return false;

        double k1 = (p2[1] - p1[1]) * 1.0 / (p2[0] - p1[0]);
        double k2 = (p2[1] - p3[1]) * 1.0 / (p2[0] - p3[0]);
        double k3 = (p3[1] - p1[1]) * 1.0 / (p3[0] - p1[0]);
        

        if(k1 == k2) {
            if(k1 == k3) {
                return false;
            }
        }

        return true;

    }
}
