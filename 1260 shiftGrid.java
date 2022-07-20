class Solution1 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        
        for(int a = 0; a < k; a++) {
            int[][] newGrid = new int[m][n];
            
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n - 1; j++) {
                    newGrid[i][j + 1] = grid[i][j];
                }
            }
            
            for(int i = 0; i < m - 1; i++) {
                newGrid[i + 1][0] = grid[i][n - 1];
            }
            
            newGrid[0][0] = grid[m - 1][n - 1];
            
            grid = newGrid;
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int[] row: grid) {
            List<Integer> cur = new ArrayList<>();
            ans.add(cur);
            
            for(int r: row)
                cur.add(r);
        }
        
        return ans;
    }
}

class Solution2 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                row.add(0);
            }

            ans.add(row);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int idx1 = (i * n + k + j) % (m * n);
                ans.get(idx1  / n).set(idx1 % n, grid[i][j]);
            }
        }

        return ans;
    }
}
