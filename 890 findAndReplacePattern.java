class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        boolean same = true;

        for(String word: words) {
            map = new HashMap<>();
            map2 = new HashMap<>();
            for(int i = 0; i < word.length(); i++) {
                System.out.println(i);
                if(map.containsKey(pattern.charAt(i))) {
                    if(map.get(pattern.charAt(i)) != word.charAt(i))
                        break;
                }

                else
                    map.put(pattern.charAt(i), word.charAt(i));
                if(map2.containsKey(word.charAt(i))) {
                    if(map2.get(word.charAt(i)) != pattern.charAt(i))
                        break;
                }
                else
                    map2.put(word.charAt(i), pattern.charAt(i));

                System.out.println(word);

                if(i == word.length() - 1)
                    list.add(word);
            }
        }

        return list;
    }
}
