class Solution {
    public boolean isAnagram(String s, String t) {
        int a = s.length(), b = t.length();
        
        if(a != b)
            return false;
        
        
        int[] cnt = new int[26];
        
        for(int i = 0; i < a; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < a; i++) {
            cnt[t.charAt(i) - 'a']--;
            
            if(cnt[t.charAt(i) - 'a'] < 0)
                return false;
        }
        
        return true;    
    }
}
