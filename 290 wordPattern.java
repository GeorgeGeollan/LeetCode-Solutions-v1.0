class Solution1 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> m1 = new HashMap<>();
        HashMap<String, Character> m2 = new HashMap<>();
        String[] words = s.split(" ");
        char[] p = pattern.toCharArray();
        int count = 0;

        if(words.length != p.length)
            return false;

        for(char ch : p)
        {
            if(m1.containsKey(ch))
            {
                if(!m1.get(ch).equals(words[count]))
                    return false;
            }
            
            else
                m1.put(ch, words[count]);

            count++;

        }

        count = 0;
        for(String word : words)
        {
            if(m2.containsKey(word))
            {
                if(!m2.get(word).equals(p[count]))
                    return false;
            }
            
            else
                m2.put(word, p[count]);

            count++;

        }

        return true;
    }
}

class Solution2 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length)
            return false;

        Map map = new HashMap();

        for(Integer i = 0; i < words.length; i++)
            if(map.put(pattern.charAt(i), i) != map.put(words[i], i))
                return false;

        return true;
    }
}
