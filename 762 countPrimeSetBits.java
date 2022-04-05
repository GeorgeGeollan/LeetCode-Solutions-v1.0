class Solution1 {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;

        for(int i = left; i <= right; i++) {
            int cur = count(i);

            if(isPrime(cur))
                cnt++;
        }

        return cnt;
    }

    public int count(int num) {
        int cnt = 0; 

        while(num > 0) {
            
            if(num % 2 == 1)
                cnt++;
            
            num /= 2;
        }

        return cnt;
    }

    public boolean isPrime(int num) {
        if(num == 1)
            return false;

        int cnt = 0;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }

        return true;
    }
}

class Solution2 {
    static boolean[] hash = new boolean[40];
    static {
        int[] nums = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

        for(int x : nums)
            hash[x] = true;
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;

        for(int i = left; i <= right; i++) {
            int x = i, cnt = 0;

            while(x != 0 && ++cnt >= 0)
                x -= (x & -x);

            if(hash[cnt])
                ans++;
        }

        return ans;
    }
}
