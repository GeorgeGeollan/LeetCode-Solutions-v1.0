class Solution1 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i <= s.length() - 10; i++)
        {
            System.out.println(s.substring(i, i+10));
            if(!map.containsKey(s.substring(i, i + 10)))
                map.put(s.substring(i, i + 10), 1);
            
            else
                map.put(s.substring(i, i + 10), map.get(s.substring(i, i + 10)) + 1);
        }

        for(String key: map.keySet())
        {
            if(map.get(key) > 1)
               list.add(key);

            System.out.println(key + " " + map.get(key));
        }
           

        return list;
    }
}

class Solution2 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), repeated = new HashSet();

        for(int i = 0; i <= s.length() - 10; i++)
            if(!seen.add(s.substring(i, i + 10)))
                repeated.add(s.substring(i, i + 10));

        return new ArrayList<>(repeated);
    }
}
