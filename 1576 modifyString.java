class Solution {
    public String modifyString(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();

        for(int i = 0; i < n; i++) {
            for(int c = 0; c < 3 && ch[i] == '?'; c++) {
                boolean same = true;
                if(i - 1 >= 0 && c + 'a' == ch[i - 1])
                    same = false;

                if(i + 1 < n && c + 'a' == ch[i + 1])
                    same = false;

                if(same)
                    ch[i] = (char)(c + 'a');
            }
        }

        return String.valueOf(ch);
    }
}
