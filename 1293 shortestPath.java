class Solution {
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int min = 0;

        boolean[][][] visited = new boolean[m][n][k + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});

        while(!queue.isEmpty())
        {
            int size = queue.size();

            for(int i = 0; i < size; i++)
            {
                int[] res = queue.poll();
                int r = res[0];
                int c = res[1];
                int ck = res[2];

                if(r == m - 1 && c == n - 1)
                    return min;

                for(int[] dir : dirs)
                {
                    int nextR = r + dir[0];
                    int nextC = c + dir[1];
                    int nextK = ck;

                    if(nextR >= 0 && nextR < m && nextC >= 0 && nextC < n)
                    {
                        if(grid[nextR][nextC] == 1)
                            nextK++;

                        if(nextK <= k && !visited[nextR][nextC][nextK])
                        {
                            visited[nextR][nextC][nextK] = true;
                            queue.add(new int[] {nextR, nextC, nextK});
                        }
                    }
                }
            }

            min++;
        }

        return -1;
    }
}
