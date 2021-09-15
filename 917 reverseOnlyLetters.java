class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack();
        char[] characters = s.toCharArray();

        for(int i = 0; i < characters.length; i++)
        {
            if((characters[i] >= 'a' && characters[i] <= 'z') || (characters[i] >= 'A' && characters[i] <= 'Z'))
                stack.push(s.charAt(i));
        }

        for(int i = 0; i < s.length(); i++)
        {
            if((characters[i] >= 'a' && characters[i] <= 'z') || (characters[i] >= 'A' && characters[i] <= 'Z'))
                characters[i] = stack.pop();
        }

        return String.valueOf(characters);
    }
}
