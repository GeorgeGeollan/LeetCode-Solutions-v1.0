class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        List<String> possibleWords = new ArrayList<>();
        List<String> res = new ArrayList<>();
        
        int[] count = new int[26];
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                count[board[i][j] - 'a']++;
        
        for(String word: words)
        {
            boolean exist = true;
            for(char ch: word.toCharArray())
            {
                if(count[ch - 'a'] == 0)
                {
                    exist = false;
                    break;
                }
                    
            }
            
            if(exist)
                possibleWords.add(word);
        }
        
        if(possibleWords.size() == 0)
            return new ArrayList<>();
        
        
        for(String word: possibleWords)
        {
            boolean found = false;
            for(int i = 0; i < m; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if(board[i][j] == word.charAt(0))
                    {
                        if(dfs(board, word, i, j, 0))
                        {
                            res.add(word);
                            found = true;
                            break;
                        }
                    }
                    
                }
                
                if(found)
                    break;
            }
        }
        
        return res;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int pos)
    {
        if(pos == word.length())
            return true;
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] == '*' || word.charAt(pos) != board[i][j])
            return false;
        
        char prev = board[i][j];
        board[i][j] = '*';
        
        boolean res = dfs(board, word, i + 1, j, pos + 1) || dfs(board, word, i, j - 1, pos + 1)
                   || dfs(board, word, i - 1, j, pos + 1) || dfs(board, word, i, j + 1, pos + 1);
        
        board[i][j] = prev;
        
        return res;
    }
}
