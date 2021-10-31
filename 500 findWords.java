class Solution1 {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String[] lines = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        boolean flag;

        for(String word: words) {
            String first = String.valueOf(word.charAt(0)).toLowerCase();
            flag = true;

            String key = lines[0].contains(first) ? lines[0] : lines[1].contains(first) ? lines[1] : lines[2].contains(first) ? lines[2] : "";
            if(key == "")
                continue;

            for(char ch : word.toCharArray()) {
                System.out.println(ch);
                if(!key.contains(String.valueOf(ch).toLowerCase())) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                list.add(word);
            }
        }

        String[] res = new String[list.size()];

        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}

class Solution2 {
    static String[] lines = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    static int[] hash = new int[26];

    static {
        for(int i = 0; i < lines.length; i++) {
            for(char ch : lines[i].toCharArray())
                hash[ch - 'a'] = i;
            }
        }


    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();

        out:for(String word : words) {
            int t = -1;

            for(int i = 0; i < word.length(); i++) {
                char ch = word.toLowerCase().charAt(i);

                if(t == -1)
                    t = hash[ch - 'a'];

                else if(t != hash[ch - 'a'])
                    continue out;
            }

            res.add(word);
        }

        return res.toArray(new String[res.size()]);
    }
}
