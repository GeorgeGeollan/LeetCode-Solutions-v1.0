class Solution {
    public boolean digitCount(String num) {
        int[] cnt = new int[10];

        for(int i = 0; i < num.length(); i++) {
            cnt[i] = num.charAt(i) - '0';
        }

        for(int i = 0; i < num.length(); i++) {
            --cnt[num.charAt(i) - '0'];
        }

        for(int i = 0; i < 10; i++) {
            if(cnt[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
