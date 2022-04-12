class Solution {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int livecnt = 0;
                
                for(int[] dir: dirs) {
                    int newX = i + dir[0];
                    int newY = j + dir[1];

                    if(newX < 0 || newX >= m || newY < 0 || newY >= n)
                        continue;

                    if(board[newX][newY] == 1 || board[newX][newY] == 2)
                        livecnt++;
                }

                if(board[i][j] == 1) {
                    if(livecnt < 2 || livecnt > 3)
                        board[i][j] = 2;
                }

                else {
                    if(livecnt == 3)
                        board[i][j] = 3;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] &= 1;
            }
        }
    }
}
