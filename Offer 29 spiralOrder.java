class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int[] ans = new int[matrix.length * matrix[0].length];
        int cnt = 0;

        while(left <= right && top <= bottom) {
            for(int i = left; i <= right && left <= right && top <= bottom; i++) {
                ans[cnt++] = matrix[top][i]; 
            }

            top++;

            for(int i = top; i <= bottom && left <= right && top <= bottom; i++) {
                ans[cnt++] = matrix[i][right];
            }

            right--;

            for(int i = right; i >= left && left <= right && top <= bottom; i--) {
                ans[cnt++] = matrix[bottom][i];
            }

            bottom--;

            for(int i = bottom; i >= top && left <= right && top <= bottom; i--) {
                ans[cnt++] = matrix[i][left];
            }
            
            left++;
        }

        return ans;
    }
}
