class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length - 1;

        for(int[] m: matrix)
        {
            while(left <= right)
            {
                int mid = left + (right - left) / 2;

                if(m[mid] > target)
                    right = mid - 1;
                
                else if(m[mid] < target)
                    left = mid + 1;

                else
                    return true;
            }

            left = 0;
            right = matrix[0].length - 1;
        }

        return false;
    }
}

class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        int row = matrix[0].length - 1;

        while(col < matrix.length && row >= 0)
        {
            if(matrix[col][row] == target)
                return true;

            else if(matrix[col][row] > target)
                row--;

            else
                col++;
        }

        return false;
    }
}
