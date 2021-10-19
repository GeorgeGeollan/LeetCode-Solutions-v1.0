class WordDictionary {
    class Node {
        Node[] tns = new Node[26];
        boolean isWord;
    }

    Node root;

    public WordDictionary() {
         root = new Node();
    }
    
    public void addWord(String word) {
        Node p = root;

        for(int i = 0; i < word.length(); i++) {
            int u = word.charAt(i) - 'a';
            if(p.tns[u] == null) {
                p.tns[u] = new Node();
            }

            p = p.tns[u];
        }

        p.isWord = true;
    }
    
    public boolean search(String word) {
        return dfs(word, root, 0);
    }

    boolean dfs(String s, Node p, int idx) {
        int n = s.length();

        if(n == idx)
            return p.isWord;

        char c = s.charAt(idx);

        if(c == '.') {
            for(int j = 0; j < 26; j++) {
                if(p.tns[j] != null && dfs(s, p.tns[j], idx + 1))
                    return true;
            }

            return false;
        }

        else {
            int u = c - 'a';

            if(p.tns[u] == null)
                return false;
            
            return dfs(s, p.tns[u], idx + 1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
