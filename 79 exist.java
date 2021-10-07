class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        List<int[]> points = new ArrayList<>();
        
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                    points.add(new int[]{i, j});
            }
        }
        
        if(points.size() == 0)
            return false;
        
        if(word.length() == 1)
            return true;
        
        for(int i = 0; i < points.size(); i++)
        {
            int[] array = points.get(i);
            int ptr = 0;
            if(dfs(board, word, array[0], array[1], ptr))
                return true;
        }
        
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int ptr)
    {
        if(ptr == word.length())
            return true;
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(ptr))
            return false;
        
        
        visited[i][j] = true;
        boolean contains = dfs(board, word, i + 1, j, ptr + 1) || dfs(board, word, i, j + 1, ptr + 1)
                        || dfs(board, word, i, j - 1, ptr + 1) || dfs(board, word, i - 1, j, ptr + 1);
        
        visited[i][j] = false;
        
        return contains;
    }
}
