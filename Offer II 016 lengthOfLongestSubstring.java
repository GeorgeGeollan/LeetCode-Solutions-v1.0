class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;

        HashSet<Character> set = new HashSet<>();

        int[] charCount = new int[26];
        char[] letter = s.toCharArray(); 

        int len = s.length();
        int l = 0, r = 0, max = 0;
        int count = 0;

        while(l < s.length())
        {
            while(r < s.length() && !set.contains(letter[r]))
            {
                set.add(letter[r]);
                r++;
                count++;
            }

            max = Math.max(count, max);
            
            l++;
            r = l;
            count = 0;
            set = new HashSet<>();
        }

        return max;
    }
}


class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0, max = 0;
        char[] letter = s.toCharArray();

        for(int i = 0; i < letter.length; i++)
        {
            if(map.containsKey(letter[i]))
                l = Math.max(l, map.get(letter[i]) + 1);

            map.put(letter[i], i);

            max = Math.max(max, i - l + 1);
        }

        return max;
    }
}
