class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0];
            
        int m = matrix[0].length;
        int n = matrix.length;
        int[] res = new int[m * n];
        int count = 0;

        int l = 0;
        int r = m - 1;
        int u = 0;
        int d = n - 1;

        while(l <= r && u <= d)
        {
            for(int i = l; i <= r; i++)
                res[count++] = matrix[u][i];         
            
            u++;
            if(l > r || u > d)
                break;

            for(int i = u; i <= d; i++)
                res[count++] = matrix[i][r];
            
            r--;
            if(l > r || u > d)
                break;

            for(int i = r; i >= l; i--)
                res[count++] = matrix[d][i];

            d--;
            if(l > r || u > d)
                break;

            for(int i = d; i >= u; i--)
                res[count++] = matrix[i][l];
                
            l++;
            if(l > r || u > d)
                break;
        }

        return res;
    }
}
