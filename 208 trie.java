class Trie {
    class TrieNode {
        boolean end;
        TrieNode[] tree = new TrieNode[26];
    }

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode head = root;
        for(int i = 0; i < word.length(); i++)
        {
            int index = word.charAt(i) - 'a';

            if(head.tree[index] == null)
                head.tree[index] = new TrieNode();

            head = head.tree[index];
        }

        head.end = true;
    }
    
    public boolean search(String word) {
        TrieNode head = root;
        for(int i = 0; i < word.length(); i++)
        {
            int index = word.charAt(i) - 'a';

            if(head.tree[index] == null)
                return false;

            head = head.tree[index];
        }

        return head.end;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode head = root;
        for(int i = 0; i < prefix.length(); i++)
        {
            int index = prefix.charAt(i) - 'a';

            if(head.tree[index] == null)
                return false;

            head = head.tree[index];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
