class Solution1 {
    public boolean judgeSquareSum(int c) {
        for(long i = 0; i * i <= c; i++)
        {
            double b = Math.sqrt(c - i * i);
            if(b == (long)b)
                return true;
        }

        return false;
    }
}

class Solution2 {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);

        while(left <= right)
        {
            long sum = left * left + right * right;
            if(sum == c)
                return true;

            else if(sum  > c)
                right--;
            
            else
                left++;
        }

        return false;
    }
}
