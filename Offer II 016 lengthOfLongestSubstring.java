class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null)
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
