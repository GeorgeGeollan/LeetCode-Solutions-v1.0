class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'X') {
                    dfs(board, i, j);
                    count++;
                }
                    
            }
        }

        return count;
    }

    public void dfs(char[][] board, int i, int j) {
        if(i < 0 || j < 0  || i >= board.length || j >= board[0].length ||  board[i][j] != 'X')
            return;

        board[i][j] = '.';

        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }
}
