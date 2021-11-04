class Solution1 {
    public boolean isPerfectSquare(int num) {
        return (int)Math.sqrt(num) == Math.sqrt(num);
    }
}

class Solution2 {
    public boolean isPerfectSquare(int num) {
        long l = 0, r = num;

        while(l <= r) {
            long mid = l + r + 1 >> 1;

            if(mid * mid <= num)
                l = mid + 1;

            else
                r = mid - 1;
        }

        return r * r == num;
    }
}
