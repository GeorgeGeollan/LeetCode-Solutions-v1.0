class MagicDictionary {
    class TrieNode {
        private boolean isWord;
        private TrieNode[] child;

        public TrieNode() {
            child = new TrieNode[26];
            isWord = false;
        }
    }

    TrieNode root;

    public MagicDictionary() {
        root = new TrieNode();
    }
    
    public void buildDict(String[] dictionary) {
        for(String s: dictionary) {
            insertNode(root, s);
        }
    }
    
    public boolean search(String searchWord) {
        return search(root, searchWord, 0, false);
    }

    public void insertNode(TrieNode root, String word) {
        char[] letter = word.toCharArray();
        TrieNode cur = root;

        for(char l: letter) {
            TrieNode trieNode;

            if(cur.child[l - 'a'] == null) {
                trieNode = new TrieNode();

                cur.child[l - 'a'] = trieNode;
            }

            trieNode = cur.child[l - 'a'];
            cur = trieNode;
        }

        cur.isWord = true;
    }

    public boolean search(TrieNode node, String word, int idx, boolean diff) {
        if(idx == word.length())
            return diff && node.isWord;

        int i = word.charAt(idx) - 'a';

        if(node.child[i] != null) {
            if(search(node.child[i], word, idx + 1, diff))
                return true;
        }

        if(!diff) {
            for(int j = 0; j < 26; j++) {
                if (j != i && node.child[j] != null) {
                    if (search(node.child[j], word, idx + 1, true)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


}
