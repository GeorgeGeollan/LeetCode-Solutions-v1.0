class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[] dirs = {-1, 0, 1, 0, 0, -1, 0, 1};

        Queue<int[]> q = new LinkedList<>();
        int m = maze.length, n = maze[0].length;
        boolean[][] visited = new boolean[m][n];

        int x = entrance[0], y = entrance[1];
        visited[x][y] = true;
        q.add(new int[]{x, y, 0});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            x = cur[0];
            y = cur[1];
            int dist = cur[2] + 1;

            for(int i = 0; i < 8; i += 2) {
                int newX = x + dirs[i];
                int newY = y + dirs[i + 1];

                if(newX >= 0 && newY >= 0 && newX < m && newY < n && !visited[newX][newY] && maze[newX][newY] == '.') {
                    if(newX == 0 || newY == 0 || newX == m - 1 || newY == n - 1)
                        return dist;

                    visited[newX][newY] = true;
                    q.add(new int[]{newX, newY, dist});
                }
            }
        }

        return -1;
    }
}
