class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
       

        s = s.toLowerCase();
        char[] letter = s.toCharArray();
        
       
        
        for(int i = 0; i < s.length(); i++)
            if((letter[i] >= 'a' && letter[i] <= 'z') || (letter[i] >= '0' && letter[i] <= '9'))
                sb.append(letter[i]);
        String res = sb.toString();
              
        
        return res.equals(new StringBuilder(res).reverse().toString());
    }
}
