class Solution1 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = n; i < s.length(); i++)
            sb.append(s.charAt(i));

        for(int i = 0; i < n; i++)
            sb.append(s.charAt(i));

        return sb.toString();
    }
}

class Solution2 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
