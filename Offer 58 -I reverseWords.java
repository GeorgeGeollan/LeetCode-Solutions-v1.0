class Solution1 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String res = "";
        int count = 0;

        for(String word: words)
        {
            if(word.equals(""))
                continue;

            if(count == 0)
                res = word;
            
            else
                res = word + " " + res;
            
            count++;
        }

        return res;
    }
}

class Solution2 {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i =  words.length - 1; i >= 0; i--)
        {
            if(words[i].equals(""))
                continue;

            sb.append(words[i] + " ");
        }

        return sb.toString().trim();
    }
}


