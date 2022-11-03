class Solution {
    public int maxRepeating(String sequence, String word) {
        String ans = word;
        int max = 0;

        while(true) {

            if(!sequence.contains(ans))
                return max;

            if(ans.length() > sequence.length()) {
                System.out.println(ans);
                break;
            }
                
            max++;
            ans += word;
        }

        return 0;
    }
}
