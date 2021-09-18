class NumMatrix {
    int[][] sum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        
        if(m > 0)
        {
            int n = matrix[0].length;
            sum = new int[m][n + 1];

            for(int i = 0; i < m; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    sum[i][j + 1] = sum[i][j] + matrix[i][j];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for(int i = row1; i <= row2; i++)
            res += sum[i][col2 + 1] - sum[i][col1];   

        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
