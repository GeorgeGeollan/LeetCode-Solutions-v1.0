class Solution1 {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        int n = words.length;

        for(int i = 0; i < n; i++) {
            for(int j = i  + 1; j < n; j++) {
                if(!set.contains(words[j]) && words[i].contains(words[j])) {
                    ans.add(words[j]);
                    set.add(words[j]);
                }
                    
                if(!set.contains(words[i]) && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    set.add(words[i]);
                }
            }
        }
        
        return ans;
    }
}

class Solution2 {
    public List<String> stringMatching(String[] ss) {
        List<String> ans = new ArrayList<>();
        int n = ss.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (ss[j].contains(ss[i])) {
                    ans.add(ss[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
