class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int[] row: matrix) {
            for(int i = 0, cnt[] = new int[matrix.length]; i < row.length; i++) {
                if(cnt[row[i] - 1]++ > 0)
                    return false;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0, cnt[] = new int[matrix.length]; j < matrix.length; j++) {
                if(cnt[matrix[j][i] - 1]++ > 0)
                    return false;
            }
        }

        return true;
    }
}
