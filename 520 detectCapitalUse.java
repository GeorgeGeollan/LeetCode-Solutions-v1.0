class Solution {
    public boolean detectCapitalUse(String word) {
        int firstLetter = word.charAt(0) - 'A';
        if(word.length() == 1)
            return true;

        int secondLetter = word.charAt(1) - 'A'; 
        if(firstLetter > 25 && secondLetter <= 25)
            return false;

        int n = word.length();

        return word.substring(1, n).equals(word.substring(1, n).toLowerCase()) || word.substring(1, n).equals(word.substring(1, n).toUpperCase());
        
    }
}
