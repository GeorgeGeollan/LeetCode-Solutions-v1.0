class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] letter = s.toCharArray();

        int count = 0;

        while(l < r)
        {
            if(letter[l] == letter[r])
            {
                l++;
                r--;
            }
            
            else
            {
                return isValidPalindrome(l, r - 1, s) || isValidPalindrome(l + 1, r, s);
            }
        }
        
        return true;

    }
    
    public boolean isValidPalindrome(int l, int r, String a)
    {
        char[] l1 = a.toCharArray();
        
        while(l < r)
        {
            if(l1[l] != l1[r])
                return false;
            
            l++;
            r--;
        }
        
        return true;
    }
}
