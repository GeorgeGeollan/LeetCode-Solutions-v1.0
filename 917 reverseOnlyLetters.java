class Solution1 {
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

class Solution2 {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int left = 0, right = s.length() - 1;
        char[] ch = s.toCharArray();

        while(left < right) {
            while(left < right && !Character.isLetter(ch[left])) {
                left++;
            }

            while(left < right && !Character.isLetter(ch[right])) {
                right--;
            }

            if(left <right) {
                char temp = ch[left];
                ch[left++] = ch[right];
                ch[right--] = temp;
            }
        }

        return String.valueOf(ch);
    }
}
