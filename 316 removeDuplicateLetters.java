class Solution {
    public String removeDuplicateLetters(String s) {
        int[] cnt = new int[26];
        Stack<Character> stack = new Stack<>();

        boolean[] inStack = new boolean[26];

        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        for(char ch: s.toCharArray()) {
            cnt[ch - 'a']--;

            if(inStack[ch - 'a'])
                continue;

            while(!stack.isEmpty() && stack.peek() > ch) {
                if(cnt[stack.peek() - 'a'] == 0)
                    break;

                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            inStack[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}class Solution {
    public String removeDuplicateLetters(String s) {
        int[] cnt = new int[26];
        Stack<Character> stack = new Stack<>();

        boolean[] inStack = new boolean[26];

        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        for(char ch: s.toCharArray()) {
            cnt[ch - 'a']--;

            if(inStack[ch - 'a'])
                continue;

            while(!stack.isEmpty() && stack.peek() > ch) {
                if(cnt[stack.peek() - 'a'] == 0)
                    break;

                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            inStack[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
