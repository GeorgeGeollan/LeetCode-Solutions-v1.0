class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int temp = 0, max = 0;

        for(int j = 0; j < s.length(); j++)
        {
            int i = map.getOrDefault(s.charAt(j), -1);
            map.put(s.charAt(j), j);
            temp = temp < j - i ? temp + 1 : j - i;
            max = Math.max(temp, max);
        }

        return max;
    }
}
