class Solution {
    public int myAtoi(String s) {
        int res = 0;
        boolean isBegin = true;
        int sign = 1;
        char[] letter = s.toCharArray();
        int index = 0, n = s.length();

        while(index < n && letter[index] == ' ')
            index++;

        if(index == n)
            return 0;

        if(letter[index] == '+')
            index++;

        else if(letter[index] == '-') {
            index++;
            sign = -1;
        }

        while(index < n) {
            if(letter[index] > '9' || letter[index] < '0')
                break;

            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (letter[index] - '0'> Integer.MAX_VALUE % 10)))
                return Integer.MAX_VALUE;

            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (letter[index] - '0'> -(Integer.MIN_VALUE % 10))))
                return Integer.MIN_VALUE;

            res = res * 10 + sign * (letter[index] - '0');
            index++;
        }

        return res;
    }
}
