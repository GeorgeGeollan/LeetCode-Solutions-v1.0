class Solution1 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        int m = rolls.length;
        int total = (m + n) * mean;

        for(int i = 0; i < m; i++)
            sum += rolls[i];
        
        if(total <= sum)
            return new int[0];
        
        int rest = total - sum;
        int avg = rest / n;
  
        double avg_double = rest * 1.0 / n;
       
        int mod = rest % n;

        if(avg_double > 6 || avg < 1)
            return new int[0];

        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            int temp = avg;
            if(mod != 0)
                temp = avg + 1;

            ans[i] = temp;
            rest = rest - temp;
            if(i + 1 == n)
                break;
            mod = rest % (n - i - 1);
        }

        return ans;
    }
}

class Solution2 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length, cnt = m + n;
        int total = mean * cnt;
        for(int roll: rolls)
            total -= roll;

        if(total < n || total > 6 * n)
            return new int[0];

        int[] ans = new int[n];
        Arrays.fill(ans, total / n);

        if(total / n * n < total) {
            int d = total - (total / n * n), idx = 0;
            while(d-- > 0)
                ans[idx++]++;
        }

        return ans;
    }
}
