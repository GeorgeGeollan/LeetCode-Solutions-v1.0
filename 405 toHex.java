class Solution {
    public String toHex(int num) {
        if(num == 0)
            return "0";

        StringBuilder sb = new StringBuilder();

        while(num != 0)
        {
            int u = num & 15;
            char cur = (char)(u + '0');

            if(u >= 10)
                cur = (char)('a' + u - 10);

            sb.append(cur);

            num >>>= 4;
        }

        return sb.reverse().toString();
    }
}
