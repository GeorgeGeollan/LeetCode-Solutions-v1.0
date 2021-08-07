class Solution1 {
    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        boolean hasSingle = false;

        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                int num = map.get(ch);
                num++;
                map.put(ch, num);
            }
            
            else
                map.put(ch, 1);
        }

        for(Integer value : map.values())
        {
            if(value % 2 == 1)
            {
                hasSingle = true;
                count += value - 1;
            }

            else
                count += value;
        }

        return hasSingle ? count + 1: count;
    }
}

class Solution2 {
    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return 0;

        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for(Character ch : s.toCharArray())
        {
            if(set.contains(ch))
            {
                set.remove(ch);
                count++;
            }

            else
                set.add(ch);
        }
        
        return set.isEmpty() ? count * 2 : count * 2 + 1;
    }
}

class Solution3 {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int count = 0;

        for(char ch: s.toCharArray())
            arr[ch]++;

        for(int n: arr)
            count += n % 2;

        return count == 0 ? s.length() : s.length() - count + 1;
    }
}
