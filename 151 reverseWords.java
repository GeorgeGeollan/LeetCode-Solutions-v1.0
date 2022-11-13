class Solution1 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        String[] words = s.split(" ");

        for(int i = words.length - 1; i >= 0; i--) {
            if(!words[i].equals(""))
                sb.append(words[i] + " ");
        }

        return sb.toString().trim();
    }
}


class Solution2 {
    public String reverseWords(String s) {
        String ans = "";
        s = s.trim();
        s = s.replaceAll("\s+", " ");
        String[] words = s.split(" ");

        for(int i = words.length - 1; i >= 0; i--) {
            ans += words[i];

            ans += " ";
        }

        return ans.substring(0, ans.length() - 1);
    }
}
