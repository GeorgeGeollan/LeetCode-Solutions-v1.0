class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0) {
            return false;
        }

        boolean isNumber = false, isE = false, isDot = false;
        char[] ch = s.trim().toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= '0' && ch[i] <= '9') {
                isNumber = true;
            }

            else if(ch[i] == '.') {
                if(isDot || isE) {
                    return false;
                }

                isDot = true;
            }

            else if(ch[i] == 'E' || ch[i] == 'e') {
                if(!isNumber || isE) {
                    return false;
                }
                
                isE = true;
                isNumber = false;
            }

            else if(ch[i] == '+' || ch[i] == '-') {
                if(i != 0 && ch[i - 1] != 'e' && ch[i - 1] != 'E') {
                    return false;
                }
            }

            else {
                return false;
            }
        }

        return isNumber;
    }
}
