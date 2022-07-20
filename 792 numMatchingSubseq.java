class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        ArrayList<Node>[] head = new ArrayList[26];
        
        for(int i = 0; i < 26; i++) {
            head[i] = new ArrayList<Node>();
        }
        
        for(String word: words) {
            head[word.charAt(0) - 'a'].add(new Node(word, 0));
        }
        
        for(char c: s.toCharArray()) {
            ArrayList<Node> old = head[c - 'a'];
            head[c - 'a'] = new ArrayList<>();
            
            for(Node node: old) {
                node.index++;
                
                if(node.index == node.word.length())
                    ans++;
                
                else
                    head[node.word.charAt(node.index) - 'a'].add(node);
            }
            
            old.clear();
        }
        
        return ans;
    }
}

class Node {
    String word;
    int index;
    
    public Node(String w, int i) {
        word = w;
        index = i;
    }
}
