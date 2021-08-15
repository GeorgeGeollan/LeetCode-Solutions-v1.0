class Solution {
    public int findTheWinner(int n, int k) {
        int[] nums = new int[n];

        for(int i = 0; i < n; i++)
            nums[i] = 1;

        int count = 1;

        int numLeft = n;
        int i = 0;

        while(numLeft > 1)
        {
            while(nums[i] == 0)
                i = (i + 1) % n;

            if(count % k == 0 && nums[i] == 1)
            {
                numLeft--;
                nums[i]--;
            }

            count++;
            i = (i + 1) % n;
        }

        
        for(int j = 0; j < n; j++)
            if(nums[j] == 1)
                return j + 1;

        return -1;
    }
}

class Solution2 {
    public int findTheWinner(int n, int k) {
        int res = 0;

        for (int i = 1; i <= n; i++)
            res = (res + k) % i;

        return res + 1;
    }
}
