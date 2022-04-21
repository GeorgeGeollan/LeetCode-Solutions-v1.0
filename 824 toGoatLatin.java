class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        String a = "a";

        for(int i = 0; i < words.length; i++) {
            
            String as = new String(a);

            char first = words[i].toLowerCase().charAt(0);

            if((first == 'a') || (first == 'e') || (first == 'i') || (first == 'o') || (first == 'u')) {
                sb.append(words[i]);
            }

            else {
                sb.append(words[i].substring(1, words[i].length()));
                sb.append(words[i].charAt(0));
            }

            sb.append("ma");
            sb.append(a);
            sb.append(" ");
            a += "a";
        }

        String ans = sb.toString();

        return ans.substring(0, ans.length() - 1);
    }
}
