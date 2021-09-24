class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1)
            return "";
        int len = palindrome.length() / 2;
        char[] letter = palindrome.toCharArray();

        for(int i = 0; i < len; i++)
        {
            if(letter[i] != 'a')
            {
                letter[i] = 'a';
                break;
            }
        }

        if(palindrome.equals(String.valueOf(letter)))
            letter[letter.length - 1] = 'b';

        

        return String.valueOf(letter);
    }
}
