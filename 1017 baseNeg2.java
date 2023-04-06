class Solution {
    public String baseNeg2(int n) {
        if(n == 0 || n == 1) {
            return String.valueOf(n);
        }

        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            int remainder = n & 1;
            sb.append(remainder);
            n -= remainder;
            n /= -2;
        }

        return sb.reverse().toString();
    }
}
