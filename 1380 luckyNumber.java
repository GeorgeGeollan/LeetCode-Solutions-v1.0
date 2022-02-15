class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;

        int[] row = new int[51];
        int[] col = new int[51];

        for(int i = 0; i < n; i++) {
            row[i]  = 100001;
            for(int j = 0; j < m; j++) {
                row[i] = Math.min(row[i], matrix[i][j]);
                col[j] = Math.max(col[j], matrix[i][j]);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[i] == matrix[i][j] && col[j] == matrix[i][j])
                    ans.add(matrix[i][j]);
            }
        }

        return ans;
    }
}
