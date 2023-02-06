class Solution1 {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[2 * n];
        int ptrx = 0;
        int ptry = n;

        for(int i = 0; i < 2 * n; i++) {
            if(i % 2 == 0) {
                temp[i] = nums[ptrx++];
            }

            else {
                temp[i] = nums[ptry++];
            }
        }

        return temp;
    }
}

class Solution2 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            ans[cnt++] = nums[i];
            ans[cnt++] = nums[i + n];
        }

        return ans;
    }
}
