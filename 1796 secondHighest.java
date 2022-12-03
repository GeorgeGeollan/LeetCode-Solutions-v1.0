class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;

        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if(cur >= '0' && cur <= '9') {
                
                if(cur - '0' > first) {
                    int temp = first;
                    first = cur - '0';

                    if(temp > second) {
                        second = temp;
                    }
                    
                }

                else if(cur - '0' < first && second < cur - '0') {
                    second = cur - '0';
                }

                System.out.println(first + " " + second);
            }
        }

        return (first == second) || (second == -1) ? -1 : second;
    }
}
