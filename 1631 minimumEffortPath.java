class Solution {
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int rows;
    int cols;

    public int minimumEffortPath(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;

        int left = 0;
        int right = 1000000;
        int mid = (left + right) / 2;

        while(left < right) {
            mid = (left + right) / 2;

            if(dfs(heights, 0, 0, mid, new boolean[rows][cols]))
                right = mid;

            else
                left = mid + 1;

        }

        return left;
    }

    public boolean dfs(int[][] heights, int row, int col, int mid, boolean[][] visited) {
        if(row == rows - 1 && col == cols - 1)
            return true;

        visited[row][col] = true;

        for(int[] dir: dirs) {
            int newRow = dir[0] + row;
            int newCol = dir[1] + col;

            if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol] && Math.abs(heights[newRow][newCol]-heights[row][col]) <= mid){
                if(dfs(heights,newRow,newCol,mid,visited)) 
                    return true;
            }
        }

        return false;
    }

}
