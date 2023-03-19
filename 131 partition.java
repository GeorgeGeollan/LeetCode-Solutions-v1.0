class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        
        boolean[][] dp = new boolean[n][n];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = i; j < n; j++) {
                if(s.charAt(i) == s.charAt(j) && (i == n - 1 || j - i <= 1 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                }
                    
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        backTrack(s, 0,  new ArrayList<>(),  ans, dp);
        
        return ans;
    }
    
    public void backTrack(String s, int start, List<String> tmp, List<List<String>> ans, boolean[][] dp) {
        if(start == s.length()) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        
        for(int i = start; i < dp.length; i++) {
            if(dp[start][i]) {
                tmp.add(s.substring(start, i + 1));
                backTrack(s, i + 1, tmp, ans, dp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
