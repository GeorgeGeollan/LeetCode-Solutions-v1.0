class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
            
        int m = matrix[0].length, low = 0, high = matrix.length * m - 1;

        while(low <= high) {
            int mid = (high - low) / 2 + low;
            if(matrix[mid / m][mid % m] == target)
                return true;

            else if(matrix[mid / m][mid % m] > target)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return false;
    }
}
