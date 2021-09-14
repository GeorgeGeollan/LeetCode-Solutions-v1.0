class Solution1 {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        char[] words = text.toCharArray();
        int count = 0;

        for(int i = 0; i < words.length; i++)
        {
            count = map.getOrDefault(words[i], 0);
            count++;
            map.put(words[i], count);
        }
        
        int min = text.length();

       
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getKey() == 'b' || entry.getKey() == 'a' || entry.getKey() == 'n')
            {
                min = Math.min(min, entry.getValue());
                set.add(entry.getKey());
            }
                
            
            if(entry.getKey() == 'o' || entry.getKey() == 'l')
            {
                min = Math.min(min, entry.getValue() / 2);
                set.add(entry.getKey());
            }
                
        }
            

        return set.size() == 5 ? min : 0;
    }
}

class Solution2 {
    public int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];
        char[] words = text.toCharArray();
        for(int i = 0; i < text.length(); i++)
            charCount[words[i] - 'a']++;

        String target = "balon";
        int min = text.length();

        for(int i = 0; i < target.length(); i++)
        {
            if((target.charAt(i) == 'l') || target.charAt(i) == 'o')
                min = Math.min(min, charCount[target.charAt(i) - 'a'] / 2);
            
            else
                min = Math.min(min, charCount[target.charAt(i) - 'a']);
        }

        return min;
    }
}
