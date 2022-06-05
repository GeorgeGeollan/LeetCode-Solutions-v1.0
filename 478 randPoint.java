class Solution {
    double r, x, y;
    Random random = new Random();
    public Solution(double radius, double x_center, double y_center) {
        r = radius;
        x = x_center;
        y = y_center;
    }
    
    public double[] randPoint() {
        double l = Math.sqrt(random.nextDouble(r * r));
        double ang = random.nextDouble(2 * Math.PI);
        double nx = x + l * Math.cos(ang), ny = y + l * Math.sin(ang);

        return new double[]{nx, ny};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
