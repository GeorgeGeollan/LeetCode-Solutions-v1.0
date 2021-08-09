class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            char[] list = new char[26];

            for(char c: s.toCharArray())
                list[c - 'a']++;

            String value = String.valueOf(list);

            if(!map.containsKey(value))
                map.put(value, new ArrayList<>());

            map.get(value).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
