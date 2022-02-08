class Solution1 {
    public int addDigits(int num) {
        int sum = sumDigit(num);
        
        while(sum >= 10)
            sum = sumDigit(sum);
        
        return sum;
    }
    
    public int sumDigit(int num) {
        int sum = 0;
        
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
}

class Solution2 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
