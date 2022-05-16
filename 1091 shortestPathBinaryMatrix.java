class Solution {
    int[][] dirs = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
    
        Queue<int[]> queue = new LinkedList<>();
        int minPath = 1;
        queue.add(new int[]{0, 0});
        grid[0][0] = 1;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                int[] temp = queue.poll();
                
                int row = temp[0];
                int col = temp[1];
                
                if(row == n - 1 && col == n - 1)
                    return minPath;
                
                for(int[] dir : dirs) {
                    int newX = row + dir[0];
                    int newY = col + dir[1];
                    
                    if(newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] == 0) {
                        grid[newX][newY] = 1;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }
            
            minPath++;
        }
        
        return -1;
    }
}
