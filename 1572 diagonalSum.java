class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        boolean isOdd = n % 2 == 1;

        for(int i = 0; i < n; i++) {
            sum += (mat[i][i] + mat[n - i - 1][i]);
        }

        return isOdd ? sum - mat[n / 2][n / 2] : sum;
    }
}
