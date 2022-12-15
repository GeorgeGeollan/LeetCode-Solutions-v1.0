class Solution {
    public int getLucky(String s, int k) {
        int temp = k;
        String ans = "";

        while(temp >= 0) {
            
            if(temp == k) {
                ans = "";
                for(int i = 0; i < s.length(); i++) {
                    ans += s.charAt(i) - 'a' + 1;
                }
                System.out.println(ans);

                int total = 0;

                for(int i = 0; i < ans.length(); i++) {
                    total += ans.charAt(i) - '0';    
                }

                ans = "" + total;
                temp--;
            }

            else if(ans.length() == 1 || temp == 0) {
                return Integer.valueOf(ans);
            }


            else {
                int total = 0;

                for(int i = 0; i < ans.length(); i++) {
                    total += ans.charAt(i) - '0';    
                }

                ans = "" + total;
                temp--;
            }

        }

        return Integer.valueOf(ans);
    }
}    
