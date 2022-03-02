class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        if(n < m)
            return false;
        
        int l1 = 0;
        int l2 = 0;
        
        while(l1 < m && l2 < n) {
            if(s.charAt(l1) == t.charAt(l2))
                l1++;
        
            l2++;
        }
        
        return l1 == m ? true : false;
    }
}
