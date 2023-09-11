class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int idx) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(idx) || idx >= word.length()) {
            return false;
        }

        board[i][j] = '\0';

        if(idx == word.length() - 1) {
            return true;

        }
        
        boolean ans = dfs(board,  word, i + 1, j, idx + 1) || dfs(board,  word, i, j + 1, idx + 1) 
        || dfs(board, word, i - 1, j, idx + 1) || dfs(board, word, i, j - 1, idx + 1);

        board[i][j] = word.charAt(idx);
        return ans;
    }
}
