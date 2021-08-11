class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            }
            else
                map.put(ch, 1);
        }

        for(char ch: s.toCharArray())
        {
            if(map.get(ch) == 1)
                return ch;
        }
            
        return ' ';
    }
}

