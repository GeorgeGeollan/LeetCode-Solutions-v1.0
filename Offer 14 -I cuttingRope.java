class Solution {
    public int cuttingRope(int n) {
       if(n <= 3) {
           return n - 1;
       }

        int numThrees = n / 3;
        int remains = n % 3;

        if(remains == 0) {
            return (int)(Math.pow(3, numThrees));
        }

        if(remains == 1) {
            return (int)(Math.pow(3, numThrees - 1)) * 4;
        }

       
        return (int)(Math.pow(3, numThrees)) * 2;
    }
}
