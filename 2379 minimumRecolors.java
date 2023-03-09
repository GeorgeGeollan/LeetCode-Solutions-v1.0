class Solution {
    public int minimumRecolors(String blocks, int k) {
        int bnum = 0;

        for(int i = 0; i < k; i++) {
            if(blocks.charAt(i) == 'W') {
                bnum++;
            }
        }

        int min = bnum;
        for(int i = k; i < blocks.length(); i++) {
            if(blocks.charAt(i) == 'W') {
                bnum++;
            }

            if(blocks.charAt(i - k) == 'W') {
                bnum--;
            }

            min = Math.min(bnum, min);
        }

        return min;
    }
}
