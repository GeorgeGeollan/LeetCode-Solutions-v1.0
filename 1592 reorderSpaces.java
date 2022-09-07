class Solution {
    public String reorderSpaces(String text) {
        int cnt = 0;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ')
                cnt++;
        }

        String temp = text.trim();
        temp = temp.replaceAll("\\s+"," ");
        String[] words = temp.split(" ");

        int len = words.length;

        if(len == 1) {
            for(int i = 0; i < cnt; i++) {
                words[0] = words[0] + " ";
            }

            return words[0];
        }

        String ans = "";
        int avg = cnt / (len - 1);
        int mod = cnt % (len - 1);
        System.out.println(avg + " " + mod);

        for(int i = 0; i < len; i++) {
            ans = ans + words[i];
            for(int j = 0; j < avg && i < len - 1; j++)
                ans = ans + " ";
        }

        for(int i = 0; i < mod; i++)
            ans = ans + " ";

        return ans;

    }
}
