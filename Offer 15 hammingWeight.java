public class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        while(n != 0)
        {
            count += n & 1;

            n >>>= 1;
        }

        return count;
    }
}

public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        while(n != 0)
        {
            count++;
            n &= (n - 1);
        }

        return count;
    }
}
