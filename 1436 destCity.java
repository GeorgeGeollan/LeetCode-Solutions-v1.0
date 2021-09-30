class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        String first = paths.get(0).get(0);

        for(List<String> list: paths)
            map.put(list.get(0), list.get(1));

        while(map.containsKey(first))
        {
            first = map.get(first);
        }

        return first;
    }
}
