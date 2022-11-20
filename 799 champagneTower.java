class Solution1 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] f = new double[102][102];
        f[0][0] = (double)poured;
        
        for(int r = 0; r < query_row; r++) {
            for(int c = 0; c <= r; c++) {
                double q = (f[r][c] - 1) / 2.0;
                
                if(q > 0) {
                    f[r + 1][c] += q;
                    f[r + 1][c + 1] += q;
                }
            }
        }
        
        return Math.min(1, f[query_row][query_glass]);
    }
}

class Solution2 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] f = new double[query_row + 10][query_glass + 10];
        f[0][0] = poured;

        for(int i = 0; i <= query_row; i++) {
            for(int j = 0; j <= query_glass; j++) {
                if(f[i][j] <= 1)
                    continue;

                f[i + 1][j] += (f[i][j] - 1) / 2;
                f[i + 1][j + 1] += (f[i][j] - 1) / 2;
            }
        }

        return Math.min(f[query_row][query_glass], 1);
    }
}
