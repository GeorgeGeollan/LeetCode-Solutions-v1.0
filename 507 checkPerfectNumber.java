class Solution1 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0)
                sum += i;
        }

        return sum == num;
    }
}

class Solution2 {
    public boolean checkPerfectNumber(int num) {
        if(num == 1)
            return false;
        
        int ans = 1;

        for(int i = 2; i <= num / i; i++) {
            if(num % i == 0)
                ans += i + num / i;
        }

        return ans == num;
    }
}
