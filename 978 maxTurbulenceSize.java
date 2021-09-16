class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int cur = 0, pre = 0, len = 1, res = 1;

        for(int i = 1; i < arr.length; i++)
        {
            cur = Integer.compare(arr[i], arr[i - 1]);

            if(pre * cur == -1)
                len++;
            
            else if(cur == 0)
                len = 1;

            else
                len = 2;

            pre = cur;
            res = Math.max(len, res);
        }

        return res;
    }
}
