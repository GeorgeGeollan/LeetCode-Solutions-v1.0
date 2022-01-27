class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.split(" ");
        int cnt = 0;
        boolean valid = true;

        for(int j = 0; j < words.length; j++) {
            if(words[j].equals(""))
                continue;

            // System.out.println("j: " + j + " wo:" + words[j]);

            String cur = words[j];
            int concat = 0;
            for(int i = 0; i < cur.length(); i++) {
                if(i == 0 || i == cur.length() - 1) {
                    if(cur.charAt(i) == '-') {
                        valid = false;
                        break;
                    }       
                }

                if(cur.charAt(i) == '-') {
                    if(cur.charAt(i - 1) == '!' || cur.charAt(i - 1) == '.' || cur.charAt(i - 1) == ',') {
                        valid = false;
                        break;
                    }

                    if(cur.charAt(i + 1) == '!' || cur.charAt(i + 1) == '.' || cur.charAt(i + 1) == ',') {
                        valid = false;
                        break;
                    }


                    concat++;

                    if(concat > 1) {
                        valid = false;
                        break;
                    }
                }
            
                if(cur.charAt(i) >= '0' && cur.charAt(i) <= '9') {
                    valid = false;
                    break;
                }

                if(i != cur.length() - 1 && (cur.charAt(i) == '!' || cur.charAt(i) == '.' || cur.charAt(i) == ',')) {
                    valid = false;
                    break;
                }
            }

            if(valid)
                cnt++;

            valid = true;
        }

        return cnt;
    }
}
