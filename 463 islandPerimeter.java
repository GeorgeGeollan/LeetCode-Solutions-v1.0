class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    int c = getPerimeter(grid, i, j);
                    perimeter += c;
                }
            }
        }

        return perimeter;
    }

    public int getPerimeter(int[][] grid, int i, int j)
    {
        int count = 0;

        if(i - 1 < 0 || j < 0 || i - 1 >= grid.length || j >= grid[0].length || grid[i - 1][j] == 0)
            count++;
        
        if(i + 1 < 0 || j < 0 || i + 1 >= grid.length || j >= grid[0].length || grid[i + 1][j] == 0)
            count++;
            

        if(i < 0 || j - 1 < 0 || i >= grid.length || j - 1 >= grid[0].length || grid[i][j - 1] == 0)
            count++;
        
        if(i + 1 < 0 || j + 1 < 0 || i >= grid.length || j + 1 >= grid[0].length || grid[i][j + 1] == 0)
            count++;

        return count;
    }
}
