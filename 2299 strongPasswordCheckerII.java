class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8) {
            return false;
        }

        Set<Character> set = new HashSet<Character>() {{
            add('!');
            add('@');
            add('#');
            add('$');
            add('%');
            add('^');
            add('&');
            add('*');
            add('(');
            add(')');
            add('-');
            add('+');
        }};

        int n = password.length();
        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isSpecial = false;

        for(int i = 0; i < n; i++) {
            if(i != n - 1 && password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }

            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)) {
                isLower = true;
            }

            else if(Character.isUpperCase(ch)) {
                isUpper = true;
            }

            else if(Character.isDigit(ch)) {
                isDigit = true;
            }

            if(set.contains(ch)) {
                isSpecial = true;
            }
        }

        return isSpecial && isUpper && isLower && isDigit;
    }
}
