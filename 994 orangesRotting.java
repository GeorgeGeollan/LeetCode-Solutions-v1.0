class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int num = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1)
                    num++;

                else if(grid[i][j] == 2)
                    queue.add(new int[]{i, j});
            }
        }

        if(queue.size() == 0 && num == 0)
            return 0;

        int[] dirX = {1, -1, 0, 0};
        int[] dirY = {0, 0, 1, -1};
        int minute = -1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            minute++;

            for(int i = 0; i < size; i++) {
                int[] cord = queue.poll();
                int x = cord[0];
                int y = cord[1];

                for(int j = 0; j < 4; j++) {
                    int newX = x + dirX[j];
                    int newY = y + dirY[j];

                    if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 1) {
                         num--;
                         grid[newX][newY] = 2;
                         queue.add(new int[]{newX, newY});
                    }
                                  
                }
            }
        }

        return num == 0 ? minute : -1;
    }
}
