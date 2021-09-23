class Solution1 {
    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;
        
        long num = n;
        long res = 0;

        while(num > 1)
        {
            res = num % 3;

            if(res != 0)
                return false;
            num /= 3;
        }

        System.out.println(num);
        return num == 1 ? true : false;
    }
}

class Solution2 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}

class Solution3 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;

        if(n == 1)
            return true;

        if(n % 3 != 0)
            return false;

        return isPowerOfThree(n / 3);
    }
}
