class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");

        for(String root: dictionary) {
            for(int i = 0; i < s.length; i++) {
                if(s[i].startsWith(root))
                    s[i] = root;
            }
        }

        return String.join(" ", s);
    }
}
