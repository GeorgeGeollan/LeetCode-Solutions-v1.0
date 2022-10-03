class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1)
            return true;

        int cnt = 0;
        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            while(i < s.length() && s.charAt(i) == '1') {
                total++;
                i++;
            }

            System.out.println(cnt);

            if(total >= 1) {
                cnt++;
            }

            if(i < s.length() && s.charAt(i) == '0') {
                total = 0;
                continue; 
            }
        }

        return cnt <= 1;
    }
}
